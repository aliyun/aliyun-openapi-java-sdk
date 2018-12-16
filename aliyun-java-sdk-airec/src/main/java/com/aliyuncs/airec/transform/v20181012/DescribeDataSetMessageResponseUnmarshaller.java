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

package com.aliyuncs.airec.transform.v20181012;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20181012.DescribeDataSetMessageResponse;
import com.aliyuncs.airec.model.v20181012.DescribeDataSetMessageResponse.ResultItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataSetMessageResponseUnmarshaller {

	public static DescribeDataSetMessageResponse unmarshall(DescribeDataSetMessageResponse describeDataSetMessageResponse, UnmarshallerContext context) {
		
		describeDataSetMessageResponse.setRequestId(context.stringValue("DescribeDataSetMessageResponse.RequestId"));
		describeDataSetMessageResponse.setCode(context.stringValue("DescribeDataSetMessageResponse.Code"));
		describeDataSetMessageResponse.setMessage(context.stringValue("DescribeDataSetMessageResponse.Message"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < context.lengthValue("DescribeDataSetMessageResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setMessage(context.stringValue("DescribeDataSetMessageResponse.Result["+ i +"].Message"));
			resultItem.setErrorLevel(context.stringValue("DescribeDataSetMessageResponse.Result["+ i +"].ErrorLevel"));
			resultItem.setErrorType(context.stringValue("DescribeDataSetMessageResponse.Result["+ i +"].ErrorType"));
			resultItem.setTimestamp(context.stringValue("DescribeDataSetMessageResponse.Result["+ i +"].Timestamp"));

			result.add(resultItem);
		}
		describeDataSetMessageResponse.setResult(result);
	 
	 	return describeDataSetMessageResponse;
	}
}