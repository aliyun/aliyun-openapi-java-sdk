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

package com.aliyuncs.ecs.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.DescribeHavsInstanceTypesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHavsInstanceTypesResponse extends AcsResponse {

	private String requestId;

	private DescribeHavsInstanceTypesResponse1 describeHavsInstanceTypesResponse1;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DescribeHavsInstanceTypesResponse1 getDescribeHavsInstanceTypesResponse1() {
		return this.describeHavsInstanceTypesResponse1;
	}

	public void setDescribeHavsInstanceTypesResponse1(DescribeHavsInstanceTypesResponse1 describeHavsInstanceTypesResponse1) {
		this.describeHavsInstanceTypesResponse1 = describeHavsInstanceTypesResponse1;
	}

	public static class DescribeHavsInstanceTypesResponse1 {

		private List<String> havsInstanceTypes;

		public List<String> getHavsInstanceTypes() {
			return this.havsInstanceTypes;
		}

		public void setHavsInstanceTypes(List<String> havsInstanceTypes) {
			this.havsInstanceTypes = havsInstanceTypes;
		}
	}

	@Override
	public DescribeHavsInstanceTypesResponse getInstance(UnmarshallerContext context) {
		return	DescribeHavsInstanceTypesResponseUnmarshaller.unmarshall(this, context);
	}
}
