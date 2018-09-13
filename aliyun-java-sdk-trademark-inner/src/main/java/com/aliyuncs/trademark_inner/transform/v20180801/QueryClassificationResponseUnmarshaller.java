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

package com.aliyuncs.trademark_inner.transform.v20180801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark_inner.model.v20180801.QueryClassificationResponse;
import com.aliyuncs.trademark_inner.model.v20180801.QueryClassificationResponse.Classification;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryClassificationResponseUnmarshaller {

	public static QueryClassificationResponse unmarshall(QueryClassificationResponse queryClassificationResponse, UnmarshallerContext context) {
		
		queryClassificationResponse.setRequestId(context.stringValue("QueryClassificationResponse.RequestId"));

		List<Classification> data = new ArrayList<Classification>();
		for (int i = 0; i < context.lengthValue("QueryClassificationResponse.Data.Length"); i++) {
			Classification classification = new Classification();
			classification.setClassificationCode(context.stringValue("QueryClassificationResponse.Data["+ i +"].ClassificationCode"));
			classification.setClassificationName(context.stringValue("QueryClassificationResponse.Data["+ i +"].ClassificationName"));
			classification.setLevel(context.integerValue("QueryClassificationResponse.Data["+ i +"].Level"));
			classification.setOfficialCode(context.stringValue("QueryClassificationResponse.Data["+ i +"].OfficialCode"));
			classification.setParentCode(context.stringValue("QueryClassificationResponse.Data["+ i +"].ParentCode"));
			classification.setId(context.integerValue("QueryClassificationResponse.Data["+ i +"].Id"));

			data.add(classification);
		}
		queryClassificationResponse.setData(data);
	 
	 	return queryClassificationResponse;
	}
}