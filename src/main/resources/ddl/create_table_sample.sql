create table sample (
	-- 整数型
	sample_id int not null primary key comment 'サンプルID'
	-- 浮動小数点数型
	, sample_decimal float not null comment 'サンプル浮動小数点'
	-- 日付型
	, sample_date date not null comment 'サンプル日付'
	-- タイムスタンプ型
	, sample_timestamp datetime not null comment 'サンプルタイムスタンプ'
	-- 文字列型（固定長）
	, sample_str_fix char(10) not null comment 'サンプル固定文字列'
	-- 文字列型（可変長）
	, sample_str_var varchar(10) not null comment 'サンプル可変文字列'
	-- 列挙型
	, sample_enum enum('type1','type2','type3') not null comment 'サンプル列挙'
) comment 'サンプルテーブル';