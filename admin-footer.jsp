<section id="bottom">
    <div class="container wow fadeInDown" data-wow-duration="1000ms" data-wow-delay="600ms">
        <div class="row">
            <% if (session.getAttribute("type").equals("Staff") || session.getAttribute("type").equals("Admin")) {%>
            <div class="col-md-4 col-sm-6">
                <div class="widget">
                    <h3>Cars info</h3>
                    <ul>
                        <li><a href="add-car.jsp">Add car info</a></li>
                        <li><a href="modify-car-select.jsp">Modify car info</a></li>
                        <li><a href="remove-car.jsp">Remove car info</a></li>
                    </ul>
                </div>    
            </div>

            <div class="col-md-4 col-sm-6">
                <div class="widget">
                    <h3>Enquiry / Feedback</h3>
                    <ul>
                        <li><a href="view-enquiries.jsp">View enquiries</a></li>
                        <li><a href="reply-enquiries.jsp">Reply enquiries</a></li>
                        <li><a href="view-feedbacks.jsp">View feedbacks</a></li>
                    </ul>
                </div>    
            </div>

            <div class="col-md-4 col-sm-6">
                <div class="widget">
                    <h3>Reports</h3>
                    <ul>
                        <li><a href="available-cars.jsp">Available cars</a></li>
                        <li><a href="rented-cars.jsp">Rented cars</a></li>
                        <li><a href="registered-users.jsp">Registered users </a></li>
                    </ul>
                </div>    
            </div>
            <% } %>
        </div>
    </div>
</section><!--/#bottom-->
