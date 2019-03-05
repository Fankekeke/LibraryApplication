/*********************************************************************************

	Template Name: Karigor - Minimalist Bootstrap4 Portfolio Template
	Description: A perfect minimal template to build beautiful and unique portfolio websites. It comes with nice and clean design.
	Version: 1.0

	Note: This is main js.

**********************************************************************************/

/**************************************************************
	
	STYLESHEET INDEXING
	|
	|
	|___ Sticky Header
	|___ Testimonial Slider Active
	|___ Bootstrap4 Tooltip Active
	|___ Portfolio Filter & Popup Active
	|___ Header Menu Effect
	|___ Mobile Menu
	|___ Boxed Layout
	|___ Counter Active
	|___ Radial Progress
	|___ Blog Item Height
	|___ Sticky Sidebar
	|
	|
	|___ END STYLESHEET INDEXING

***************************************************************/


(function ($) {
	'use strict';



	/* Sticky Header */
	$(window).on('scroll', function () {
		var scrollPos = $(this).scrollTop();
		if (scrollPos > 200) {
			$('.sticky-header').addClass('is-sticky');
		} else {
			$('.sticky-header').removeClass('is-sticky');
		}
	});



	/* Testimonial Slider Active */
	$('.testimonial-slider').slick({
		slidesToShow: 1,
		autoplay: true,
		autoplaySpeed: 5000,
		dots: true,
		arrows: false,
		easing: 'ease-in-out',
	});





	/* Bootstrap4 Tooltip Active */
	$('[data-toggle="tooltip"]').tooltip();





	/* Portfolio Filter & Popup Active */
	function portfolioFilterLightgallery(){
		var $gallery = $('.portfolios-wrapper');
		var $boxes = $('.portfolio-item');
		$boxes.hide();

		$gallery.imagesLoaded({
			background: true
		}, function () {
			$boxes.fadeIn();
			$gallery.isotope({
				itemSelector: '.portfolio-item',
				layoutMode: 'masonry',
				masonry: {
					columnWidth: 1,
				}
			});
		});

		$('.portfolio-filters button').on('click', function () {
			
			var filterValue = $(this).attr('data-filter');
			$gallery.isotope({
				filter: filterValue
			});
			$gallery.data('lightGallery').destroy(true);
			$('.portfolios-wrapper').lightGallery({
				selector: filterValue.replace('*', '') + ' .portfolio-zoom-button',
			});

			$('.portfolio-filters button').removeClass('is-checked');
			$(this).addClass('is-checked');

		});

		$('.portfolios-wrapper').lightGallery({
			selector: '.portfolio-item .portfolio-zoom-button'
		});
	}
	portfolioFilterLightgallery();




	/* Header Menu Effect */
	$('.header-navigation-trigger').on('click', function(){
		$(this).toggleClass('is-active');
		$('.main-navigation').toggleClass('is-visible');
	});




	/* Mobile Menu */
	$('nav.main-navigation').meanmenu({
		meanMenuClose: '<img class="black" src="img/icons/icon-close.png" alt="close icon"><img class="white" src="img/icons/icon-close-white.png" alt="close icon">',
		meanMenuCloseSize: '18px',
		meanScreenWidth: '991',
		meanExpandableChildren: true,
		meanMenuContainer: '.mobile-menu',
		onePage: true
	});
	



	/* Boxed Layout */
	if( $('.boxed-layout').length ){
		$('body').css('background-color', '#f1f1f1');
	}




	/* Counter Active */
	$('.counter-active').counterUp({
		delay: 10,
		time: 1000
	});





	/* Radial Progress */
	$('.radial-progress').waypoint(function(){

		$('.radial-progress').easyPieChart({
			lineWidth: 3,
			trackColor: false,
			scaleLength: 0,
			rotate: -45,
			barColor: '#555555'
		});

	}, {
		triggerOnce: true,
		offset: 'bottom-in-view'
	});




	/* Blog Item Height */
	$('.blog-item').matchHeight();




	/* Sticky Sidebar */
	$('.sticky-sidebar-active').theiaStickySidebar({
		additionalMarginTop: 30,
		additionalMarginBottom: 30
	});




})(jQuery);