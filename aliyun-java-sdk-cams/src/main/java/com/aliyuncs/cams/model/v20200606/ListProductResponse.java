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

package com.aliyuncs.cams.model.v20200606;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cams.transform.v20200606.ListProductResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListProductResponse extends AcsResponse {

	private String accessDeniedDetail;

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private Model model;

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Model getModel() {
		return this.model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public static class Model {

		private List<Map<Object,Object>> data;

		private Paging paging;

		public List<Map<Object,Object>> getData() {
			return this.data;
		}

		public void setData(List<Map<Object,Object>> data) {
			this.data = data;
		}

		public Paging getPaging() {
			return this.paging;
		}

		public void setPaging(Paging paging) {
			this.paging = paging;
		}

		public static class Paging {

			private Cursors cursors;

			public Cursors getCursors() {
				return this.cursors;
			}

			public void setCursors(Cursors cursors) {
				this.cursors = cursors;
			}

			public static class Cursors {

				private String before;

				private String after;

				public String getBefore() {
					return this.before;
				}

				public void setBefore(String before) {
					this.before = before;
				}

				public String getAfter() {
					return this.after;
				}

				public void setAfter(String after) {
					this.after = after;
				}
			}
		}
	}

	@Override
	public ListProductResponse getInstance(UnmarshallerContext context) {
		return	ListProductResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
