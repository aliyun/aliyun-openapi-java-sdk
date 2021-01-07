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

package com.aliyuncs.airec.transform.v20201126;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20201126.DescribeLatestTaskResponse;
import com.aliyuncs.airec.model.v20201126.DescribeLatestTaskResponse.IndexVersion;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLatestTaskResponseUnmarshaller {

	public static DescribeLatestTaskResponse unmarshall(DescribeLatestTaskResponse describeLatestTaskResponse, UnmarshallerContext _ctx) {
		
		describeLatestTaskResponse.setRequestId(_ctx.stringValue("DescribeLatestTaskResponse.requestId"));

		List<IndexVersion> result = new ArrayList<IndexVersion>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLatestTaskResponse.result.Length"); i++) {
			IndexVersion indexVersion = new IndexVersion();
			indexVersion.setVersionId(_ctx.stringValue("DescribeLatestTaskResponse.result["+ i +"].versionId"));
			indexVersion.setStatus(_ctx.stringValue("DescribeLatestTaskResponse.result["+ i +"].status"));
			indexVersion.setBuiltTime(_ctx.stringValue("DescribeLatestTaskResponse.result["+ i +"].builtTime"));
			indexVersion.setSwitchedTime(_ctx.stringValue("DescribeLatestTaskResponse.result["+ i +"].switchedTime"));
			indexVersion.setRollbackEnabled(_ctx.booleanValue("DescribeLatestTaskResponse.result["+ i +"].rollbackEnabled"));
			indexVersion.setCostSeconds(_ctx.integerValue("DescribeLatestTaskResponse.result["+ i +"].costSeconds"));
			indexVersion.setSize(_ctx.longValue("DescribeLatestTaskResponse.result["+ i +"].size"));
			indexVersion.setProgress(_ctx.integerValue("DescribeLatestTaskResponse.result["+ i +"].progress"));
			indexVersion.setFlowType(_ctx.stringValue("DescribeLatestTaskResponse.result["+ i +"].flowType"));
			indexVersion.setCode(_ctx.stringValue("DescribeLatestTaskResponse.result["+ i +"].code"));
			indexVersion.setMessage(_ctx.stringValue("DescribeLatestTaskResponse.result["+ i +"].message"));

			result.add(indexVersion);
		}
		describeLatestTaskResponse.setResult(result);
	 
	 	return describeLatestTaskResponse;
	}
}