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

package com.aliyuncs.datav_outer.model.v20190402;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.datav_outer.transform.v20190402.DeleteDatasourceUserAssociationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DeleteDatasourceUserAssociationResponse extends AcsResponse {

	private String requestId;

	private String type;

	private String memberUId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMemberUId() {
		return this.memberUId;
	}

	public void setMemberUId(String memberUId) {
		this.memberUId = memberUId;
	}

	@Override
	public DeleteDatasourceUserAssociationResponse getInstance(UnmarshallerContext context) {
		return	DeleteDatasourceUserAssociationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
