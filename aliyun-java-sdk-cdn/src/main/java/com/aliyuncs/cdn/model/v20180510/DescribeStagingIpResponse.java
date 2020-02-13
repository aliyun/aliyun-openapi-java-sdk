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

package com.aliyuncs.cdn.model.v20180510;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20180510.DescribeStagingIpResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeStagingIpResponse extends AcsResponse {

	private String requestId;

	private List<String> iPV4s;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getIPV4s() {
		return this.iPV4s;
	}

	public void setIPV4s(List<String> iPV4s) {
		this.iPV4s = iPV4s;
	}

	@Override
	public DescribeStagingIpResponse getInstance(UnmarshallerContext context) {
		return	DescribeStagingIpResponseUnmarshaller.unmarshall(this, context);
	}
}
