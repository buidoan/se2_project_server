INSERT INTO `se2`.`role` (`id`, `role_name`) VALUES ('1', 'User');
INSERT INTO `se2`.`role` (`id`, `role_name`) VALUES ('2', 'Admin');

INSERT INTO `se2`.`user` (`id`,`user_name`, `user_password`) VALUES ('1','user', '$2a$10$yyzrbW26RKwlBIioraT.lO/v6D9buH0CpYAQsqKOJINaHdwM1UX6G');
INSERT INTO `se2`.`user` (`id`,`user_name`, `user_password`) VALUES ('2','admin', '$2a$10$yyzrbW26RKwlBIioraT.lO/v6D9buH0CpYAQsqKOJINaHdwM1UX6G');
INSERT INTO `se2`.`user_role` (`user_id`, `role_id`) VALUES ('1', '1');
INSERT INTO `se2`.`user_role` (`user_id`, `role_id`) VALUES ('2', '2');

INSERT INTO `se2`.`gender` (`gender_name`) VALUES ('male');
INSERT INTO `se2`.`gender` (`gender_name`) VALUES ('female');

INSERT INTO `se2`.`size` (`size_name`) VALUES ('S');
INSERT INTO `se2`.`size` (`size_name`) VALUES ('M');
INSERT INTO `se2`.`size` (`size_name`) VALUES ('L');
INSERT INTO `se2`.`size` (`size_name`) VALUES ('XL');
INSERT INTO `se2`.`size` (`size_name`) VALUES ('XXL');
INSERT INTO `se2`.`size` (`size_name`) VALUES ('XXXL');

INSERT INTO `se2`.`color` (`color_name`) VALUES ('white');
INSERT INTO `se2`.`color` (`color_name`) VALUES ('black');
INSERT INTO `se2`.`color` (`color_name`) VALUES ('blue');
INSERT INTO `se2`.`color` (`color_name`) VALUES ('red');
INSERT INTO `se2`.`color` (`color_name`) VALUES ('yellow');
INSERT INTO `se2`.`color` (`color_name`) VALUES ('green');

INSERT INTO `se2`.`category_Slug` (`name`) VALUES ('ao-khoac');
INSERT INTO `se2`.`category_Slug` (`name`) VALUES ('ao-len');
INSERT INTO `se2`.`category_Slug` (`name`) VALUES ('quan-dai');
INSERT INTO `se2`.`category_Slug` (`name`) VALUES ('ao-thun');
INSERT INTO `se2`.`category_Slug` (`name`) VALUES ('vay-lien');
INSERT INTO `se2`.`category_Slug` (`name`) VALUES ('ao-phông');
INSERT INTO `se2`.`category_Slug` (`name`) VALUES ('quan-jean');
INSERT INTO `se2`.`category_Slug` (`name`) VALUES ('ao-ni');
INSERT INTO `se2`.`category_Slug` (`name`) VALUES ('quan-dui');
INSERT INTO `se2`.`category_Slug` (`name`) VALUES ('ao-somi');

INSERT INTO `se2`.`product` (`desc`,`create_date`, `discount`, `image1`, `image2`, `image3`, `regular_price`, `slug_name`, `title`,`category_slug_name`) VALUES ('Áo blazer nam dáng ôm gọn gàng cơ thể. Áo 2 lớp bên trong có lớp lót mềm.',current_timestamp(), '0', 'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-blazer-nam-1?alt=media&token=9c682603-407d-438a-a4db-d8ee86a0aad7', 'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-blazer-nam-2?alt=media&token=2b040faf-edb1-4184-8e26-5e2b30b7c363', 'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-blazer-nam-3?alt=media&token=ff5c46ff-9bc5-4e72-9713-e9d0cac29eb7', '899000', 'ao-blazer-nam', 'Áo blazer nam','ao-khoac');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('1', 'green');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('1', 'red');
INSERT INTO `se2`.`product_genders` (`product_id`, `genders_gender_name`) VALUES ('1', 'male');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('1', 'S');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('1', 'M');

INSERT INTO `se2`.`product` (`desc`,`create_date`, `discount`, `image1`, `image2`, `image3`, `regular_price`, `slug_name`, `title`,`category_slug_name`) VALUES ('Áo cardigan nữ',current_timestamp(), '0', 'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-cardigan-nu-1?alt=media&token=3a82d7c8-2cbe-489f-9583-b7dbd0946bc3', 'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-cardigan-nu-2?alt=media&token=d83f7c59-a042-49b1-9080-e01c746352be', 'https://firebasestorage.googleapis.com/v0/b/e-commercal.appspot.com/o/ao-cardigan-nu-3?alt=media&token=ab0d7815-623d-4b79-aa37-ebb43c6938f5', '699000', 'a0-cardigan-nu', 'Áo cardigan nữ','ao-len');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('2', 'yellow');
INSERT INTO `se2`.`product_colors` (`product_id`, `colors_color_name`) VALUES ('2', 'green');
INSERT INTO `se2`.`product_genders` (`product_id`, `genders_gender_name`) VALUES ('2', 'female');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('2', 'M');
INSERT INTO `se2`.`product_sizes` (`product_id`, `sizes_size_name`) VALUES ('2', 'L');