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

package com.aliyuncs.jarvis_public.model.v20180621;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.jarvis_public.transform.v20180621.DescribeAttackedIpResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAttackedIpResponse extends AcsResponse {

	private String requestId;

	private String module;

	private List<String> ipList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public List<String> getIpList() {
		return this.ipList;
	}

	public void setIpList(List<String> ipList) {
		this.ipList = ipList;
	}

	@Override
	public DescribeAttackedIpResponse getInstance(UnmarshallerContext context) {
		return	DescribeAttackedIpResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
