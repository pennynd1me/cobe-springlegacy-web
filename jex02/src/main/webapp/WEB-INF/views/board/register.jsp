
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="../includes/header.jsp"%>
<div id="page-wrapper">
	<div class="row">
		<div class="col-lg-12">
			<h1 class="page-header">게시글 등록</h1>
		</div>
		<!-- /.col-lg-12 -->
	</div>
	<!-- /.row -->
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">바르고 고운말을 사용합시다.</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-lg-6">
							<form role="form" action="/board/register" method="post">
								<div class="form-group">
									<label>제목</label> <input class="form-control" name="title">
								</div>
								<div class="form-group">
									<label>작성자</label> <input class="form-control"
										placeholder="작성자 입력" name="writer">
								</div>

								<div class="form-group">
									<label>글 내용</label>
									<textarea class="form-control" rows="3" name="content"></textarea>
								</div>

								<button type="submit" class="btn btn-default">글 등록
								</button>
								<button type="reset" class="btn btn-default">다시쓰기
								</button>
							</form>
						</div>
					</div>
					<!-- /.col-lg-6 (nested) -->
				</div>
				<!-- /.row (nested) -->
			</div>
			<!-- /.panel-body -->
		</div>
		<!-- /.panel -->
	</div>
	<!-- /.col-lg-12 -->
</div>
<!-- /.row -->
</div>
<!-- /#page-wrapper -->

</div>
<!-- /#wrapper -->

<!-- jQuery -->
<script src="../vendor/jquery/jquery.min.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="../vendor/bootstrap/js/bootstrap.min.js"></script>

<!-- Metis Menu Plugin JavaScript -->
<script src="../vendor/metisMenu/metisMenu.min.js"></script>

<!-- Custom Theme JavaScript -->
<script src="../dist/js/sb-admin-2.js"></script>

</body>

</html>
