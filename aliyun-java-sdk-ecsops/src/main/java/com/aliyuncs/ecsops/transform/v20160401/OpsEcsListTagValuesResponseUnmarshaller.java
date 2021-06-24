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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsEcsListTagValuesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsEcsListTagValuesResponse.TagValue;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsEcsListTagValuesResponseUnmarshaller {

	public static OpsEcsListTagValuesResponse unmarshall(OpsEcsListTagValuesResponse opsEcsListTagValuesResponse, UnmarshallerContext _ctx) {
		
		opsEcsListTagValuesResponse.setRequestId(_ctx.stringValue("OpsEcsListTagValuesResponse.RequestId"));
		opsEcsListTagValuesResponse.setNextToken(_ctx.stringValue("OpsEcsListTagValuesResponse.NextToken"));

		List<TagValue> tagValues = new ArrayList<TagValue>();
		for (int i = 0; i < _ctx.lengthValue("OpsEcsListTagValuesResponse.TagValues.Length"); i++) {
			TagValue tagValue = new TagValue();
			tagValue.setTagValue(_ctx.stringValue("OpsEcsListTagValuesResponse.TagValues["+ i +"].TagValue"));
			tagValue.setTagKey(_ctx.stringValue("OpsEcsListTagValuesResponse.TagValues["+ i +"].TagKey"));

			tagValues.add(tagValue);
		}
		opsEcsListTagValuesResponse.setTagValues(tagValues);
	 
	 	return opsEcsListTagValuesResponse;
	}
}