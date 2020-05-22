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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeUnCompatibilitySqlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUnCompatibilitySqlResponseUnmarshaller {

	public static DescribeUnCompatibilitySqlResponse unmarshall(DescribeUnCompatibilitySqlResponse describeUnCompatibilitySqlResponse, UnmarshallerContext _ctx) {
		
		describeUnCompatibilitySqlResponse.setRequestId(_ctx.stringValue("DescribeUnCompatibilitySqlResponse.RequestId"));
		describeUnCompatibilitySqlResponse.setSuccess(_ctx.booleanValue("DescribeUnCompatibilitySqlResponse.Success"));

		List<String> errorSqls = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUnCompatibilitySqlResponse.ErrorSqls.Length"); i++) {
			errorSqls.add(_ctx.stringValue("DescribeUnCompatibilitySqlResponse.ErrorSqls["+ i +"]"));
		}
		describeUnCompatibilitySqlResponse.setErrorSqls(errorSqls);
	 
	 	return describeUnCompatibilitySqlResponse;
	}
}