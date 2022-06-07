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

package com.aliyuncs.appstream_center.model.v20210901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.appstream_center.transform.v20210901.PageListAppInstanceGroupUserResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PageListAppInstanceGroupUserResponse extends AcsResponse {

	private String requestId;

	private List<String> users;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getUsers() {
		return this.users;
	}

	public void setUsers(List<String> users) {
		this.users = users;
	}

	@Override
	public PageListAppInstanceGroupUserResponse getInstance(UnmarshallerContext context) {
		return	PageListAppInstanceGroupUserResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
