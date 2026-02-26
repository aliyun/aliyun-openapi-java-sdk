/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.airticketopen.model.v20230117;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.airticketopen.transform.v20230117.BookResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BookResponse extends AcsResponse {

	private Integer status;

	private String error_code;

	private String error_msg;

	private Boolean success;

	private String requestId;

	private Data data;

	private Error_data error_data;

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError_code() {
		return this.error_code;
	}

	public void setError_code(String error_code) {
		this.error_code = error_code;
	}

	public String getError_msg() {
		return this.error_msg;
	}

	public void setError_msg(String error_msg) {
		this.error_msg = error_msg;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public Error_data getError_data() {
		return this.error_data;
	}

	public void setError_data(Error_data error_data) {
		this.error_data = error_data;
	}

	public static class Data {

		private List<Order_listItem> order_list;

		public List<Order_listItem> getOrder_list() {
			return this.order_list;
		}

		public void setOrder_list(List<Order_listItem> order_list) {
			this.order_list = order_list;
		}

		public static class Order_listItem {

			private Long order_num;

			public Long getOrder_num() {
				return this.order_num;
			}

			public void setOrder_num(Long order_num) {
				this.order_num = order_num;
			}
		}
	}

	public static class Error_data {

		private List<Order_listItem2> order_list1;

		public List<Order_listItem2> getOrder_list1() {
			return this.order_list1;
		}

		public void setOrder_list1(List<Order_listItem2> order_list1) {
			this.order_list1 = order_list1;
		}

		public static class Order_listItem2 {

			private Long order_num;

			public Long getOrder_num() {
				return this.order_num;
			}

			public void setOrder_num(Long order_num) {
				this.order_num = order_num;
			}
		}
	}

	@Override
	public BookResponse getInstance(UnmarshallerContext context) {
		return	BookResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
