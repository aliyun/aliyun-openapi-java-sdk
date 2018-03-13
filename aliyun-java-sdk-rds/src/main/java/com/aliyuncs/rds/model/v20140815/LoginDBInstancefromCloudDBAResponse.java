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
package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.LoginDBInstancefromCloudDBAResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class LoginDBInstancefromCloudDBAResponse extends AcsResponse {

	private String requestId;

	private String listData;

	private String attrData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getListData() {
		return this.listData;
	}

	public void setListData(String listData) {
		this.listData = listData;
	}

	public String getAttrData() {
		return this.attrData;
	}

	public void setAttrData(String attrData) {
		this.attrData = attrData;
	}

	@Override
	public LoginDBInstancefromCloudDBAResponse getInstance(UnmarshallerContext context) {
		return	LoginDBInstancefromCloudDBAResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
