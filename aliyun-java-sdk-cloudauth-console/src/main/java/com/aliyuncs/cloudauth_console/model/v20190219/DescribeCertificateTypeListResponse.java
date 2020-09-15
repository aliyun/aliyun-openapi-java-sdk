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

package com.aliyuncs.cloudauth_console.model.v20190219;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudauth_console.transform.v20190219.DescribeCertificateTypeListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCertificateTypeListResponse extends AcsResponse {

	private String requestId;

	private List<String> typeList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getTypeList() {
		return this.typeList;
	}

	public void setTypeList(List<String> typeList) {
		this.typeList = typeList;
	}

	@Override
	public DescribeCertificateTypeListResponse getInstance(UnmarshallerContext context) {
		return	DescribeCertificateTypeListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
