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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeRiskItemTypeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRiskItemTypeResponse extends AcsResponse {

	private String requestId;

	private List<ItemType> list;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ItemType> getList() {
		return this.list;
	}

	public void setList(List<ItemType> list) {
		this.list = list;
	}

	public static class ItemType {

		private Long id;

		private String title;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}
	}

	@Override
	public DescribeRiskItemTypeResponse getInstance(UnmarshallerContext context) {
		return	DescribeRiskItemTypeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
