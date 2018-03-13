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
package com.aliyuncs.ossadmin.model.v20150520;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ossadmin.transform.v20150520.GetBucketVipsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetBucketVipsResponse extends AcsResponse {

	private String requestId;

	private List<String> vipList;

	public String getrequestId() {
		return this.requestId;
	}

	public void setrequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getvipList() {
		return this.vipList;
	}

	public void setvipList(List<String> vipList) {
		this.vipList = vipList;
	}

	@Override
	public GetBucketVipsResponse getInstance(UnmarshallerContext context) {
		return	GetBucketVipsResponseUnmarshaller.unmarshall(this, context);
	}
}
