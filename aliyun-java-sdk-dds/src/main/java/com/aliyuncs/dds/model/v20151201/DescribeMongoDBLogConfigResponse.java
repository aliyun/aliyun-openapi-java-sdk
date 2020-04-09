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

package com.aliyuncs.dds.model.v20151201;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dds.transform.v20151201.DescribeMongoDBLogConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMongoDBLogConfigResponse extends AcsResponse {

	private String requestId;

	private String userProjectName;

	private Integer isUserProjectLogstoreExist;

	private Integer isEtlMetaExist;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getUserProjectName() {
		return this.userProjectName;
	}

	public void setUserProjectName(String userProjectName) {
		this.userProjectName = userProjectName;
	}

	public Integer getIsUserProjectLogstoreExist() {
		return this.isUserProjectLogstoreExist;
	}

	public void setIsUserProjectLogstoreExist(Integer isUserProjectLogstoreExist) {
		this.isUserProjectLogstoreExist = isUserProjectLogstoreExist;
	}

	public Integer getIsEtlMetaExist() {
		return this.isEtlMetaExist;
	}

	public void setIsEtlMetaExist(Integer isEtlMetaExist) {
		this.isEtlMetaExist = isEtlMetaExist;
	}

	@Override
	public DescribeMongoDBLogConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeMongoDBLogConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
