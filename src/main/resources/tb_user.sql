CREATE SEQUENCE "public"."id_seq" 
INCREMENT 1
MINVALUE  1
MAXVALUE 2147483647
START 1
CACHE 1;

SELECT setval('"public"."id_seq"', 1, true);

CREATE TABLE "public"."tb_user" (
  "id" int4 NOT NULL DEFAULT nextval('id_seq'::regclass),
  "user_name" varchar(50) COLLATE "pg_catalog"."default",
  "blog_url" varchar(50) COLLATE "pg_catalog"."default",
  "sex" varchar(2) COLLATE "pg_catalog"."default",
  "province_name" varchar(20) COLLATE "pg_catalog"."default",
  "hobby" varchar(50) COLLATE "pg_catalog"."default",
  "remark" varchar(50) COLLATE "pg_catalog"."default",
  CONSTRAINT "tb_user_pkey" PRIMARY KEY ("id")
)
;