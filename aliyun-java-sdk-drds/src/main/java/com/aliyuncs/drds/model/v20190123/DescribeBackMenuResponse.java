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

package com.aliyuncs.drds.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.DescribeBackMenuResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackMenuResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<ListItem> list;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<ListItem> getList() {
		return this.list;
	}

	public void setList(List<ListItem> list) {
		this.list = list;
	}

	public static class ListItem {

		private String menuName;

		private Boolean support;

		public String getMenuName() {
			return this.menuName;
		}

		public void setMenuName(String menuName) {
			this.menuName = menuName;
		}

		public Boolean getSupport() {
			return this.support;
		}

		public void setSupport(Boolean support) {
			this.support = support;
		}
	}

	@Override
	public DescribeBackMenuResponse getInstance(UnmarshallerContext context) {
		return	DescribeBackMenuResponseUnmarshaller.unmarshall(this, context);
	}
}
