

        -- Database: `librarymanagement`
        --

        -- --------------------------------------------------------

        --
        -- Table structure for table `books`
        --
--
--        CREATE TABLE  books (
--        `id` int(10) NOT NULL AUTO_INCREMENT,
--        `callno` varchar(100) NOT NULL,
--        `name` varchar(100) NOT NULL,
--        `author` varchar(100) NOT NULL,
--        `publisher` varchar(100) NOT NULL,
--        `quantity` int(10) NOT NULL,
--        `issued` int(10) NOT NULL,
--        `added_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
--        PRIMARY KEY (`id`))



        INSERT INTO `books`(`id`, `callno`, `name`, `author`, `publisher`, `quantity`, `issued`, `added_date`) VALUES
        (1, 'A@4', 'C In Depth', 'Shrivastav', 'BPB', 2, 2, '2023-05-28 19:37:56'),
        (2, 'B@1', 'DBMS', 'Korth', 'Pearson', 3, 2, '2023-05-28 18:39:52'),
        (3, 'G@12', 'Let''s see', 'Yashwant Kanetkar', 'BPB', 10, 5, '2023-05-28 23:02:14');


