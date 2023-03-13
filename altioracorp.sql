PGDMP                         {            altioracorp    12.13    12.13                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    43273    altioracorp    DATABASE     �   CREATE DATABASE altioracorp WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_Spain.1252' LC_CTYPE = 'Spanish_Spain.1252';
    DROP DATABASE altioracorp;
                postgres    false            �            1259    43274    client    TABLE     �   CREATE TABLE public.client (
    id_client uuid NOT NULL,
    name character varying NOT NULL,
    last_name character varying NOT NULL
);
    DROP TABLE public.client;
       public         heap    postgres    false            �            1259    43348    orders    TABLE     �   CREATE TABLE public.orders (
    id_order uuid NOT NULL,
    id_product uuid,
    id_client uuid,
    date_created timestamp without time zone
);
    DROP TABLE public.orders;
       public         heap    postgres    false            �            1259    43281    product    TABLE     �   CREATE TABLE public.product (
    id uuid NOT NULL,
    name character varying NOT NULL,
    price_unit numeric(16,2) NOT NULL,
    code character varying NOT NULL
);
    DROP TABLE public.product;
       public         heap    postgres    false                      0    43274    client 
   TABLE DATA           <   COPY public.client (id_client, name, last_name) FROM stdin;
    public          postgres    false    202   �                 0    43348    orders 
   TABLE DATA           O   COPY public.orders (id_order, id_product, id_client, date_created) FROM stdin;
    public          postgres    false    204   �                 0    43281    product 
   TABLE DATA           =   COPY public.product (id, name, price_unit, code) FROM stdin;
    public          postgres    false    203   �       �
           2606    43296    client client_pkey 
   CONSTRAINT     W   ALTER TABLE ONLY public.client
    ADD CONSTRAINT client_pkey PRIMARY KEY (id_client);
 <   ALTER TABLE ONLY public.client DROP CONSTRAINT client_pkey;
       public            postgres    false    202            �
           2606    43352 	   orders pk 
   CONSTRAINT     M   ALTER TABLE ONLY public.orders
    ADD CONSTRAINT pk PRIMARY KEY (id_order);
 3   ALTER TABLE ONLY public.orders DROP CONSTRAINT pk;
       public            postgres    false    204            �
           2606    43298    product product_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.product
    ADD CONSTRAINT product_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.product DROP CONSTRAINT product_pkey;
       public            postgres    false    203            �
           1259    43280    client_id_client_idx    INDEX     S   CREATE UNIQUE INDEX client_id_client_idx ON public.client USING btree (id_client);
 (   DROP INDEX public.client_id_client_idx;
       public            postgres    false    202            �
           1259    43284    product_id_idx    INDEX     G   CREATE UNIQUE INDEX product_id_idx ON public.product USING btree (id);
 "   DROP INDEX public.product_id_idx;
       public            postgres    false    203               �   x�%ͻN1��:y��\�qI��6���;�&�ޟhiN���!�"F�P�Z�
�p�0D����yr��n��!qX�LځrZ&�T�Bi�}$��i������c���j`�*��� �GT紅�/��s��)�r����\��U��A�b�7ބ��^濺����%���;�         '  x����m1��*� ���Z�H��	�Evh��x�����f�%:���"�&�@g1�8�ro
��@i#�₍Ğ��i\�|�	�r�f%�	4sc���bdb@��|���q�H�F�ͷ{�F�������l0�
�р(�+=�fUȥ��:��z�A7?�V)�z9u���{�RH'�$"f�Yo9
��z��Wk~��&*B�����^G��!�B1�,��:���0V�	�%�O���O�|��Bo6���\àV�ۡ�ݴ����Y?���K8���}�_[U��         �   x�ͱ
� ��Y�����:'t*J�.j���O�.���s�M5xp)5�!��6$�TjU*f�����np4�42;�)j ɠe��C!ȢE���1z��=�g7�?9�3"Yt���@����BiQ��6�������t��Ǎ��s��~� +�     