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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.DescribeModifyParameterLogResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeModifyParameterLogResponse.ChangelogsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeModifyParameterLogResponseUnmarshaller {

	public static DescribeModifyParameterLogResponse unmarshall(DescribeModifyParameterLogResponse describeModifyParameterLogResponse, UnmarshallerContext _ctx) {
		
		describeModifyParameterLogResponse.setRequestId(_ctx.stringValue("DescribeModifyParameterLogResponse.RequestId"));

		List<ChangelogsItem> changelogs = new ArrayList<ChangelogsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeModifyParameterLogResponse.Changelogs.Length"); i++) {
			ChangelogsItem changelogsItem = new ChangelogsItem();
			changelogsItem.setParameterName(_ctx.stringValue("DescribeModifyParameterLogResponse.Changelogs["+ i +"].ParameterName"));
			changelogsItem.setParameterValueBefore(_ctx.stringValue("DescribeModifyParameterLogResponse.Changelogs["+ i +"].ParameterValueBefore"));
			changelogsItem.setParameterValueAfter(_ctx.stringValue("DescribeModifyParameterLogResponse.Changelogs["+ i +"].ParameterValueAfter"));
			changelogsItem.setParameterValid(_ctx.stringValue("DescribeModifyParameterLogResponse.Changelogs["+ i +"].ParameterValid"));
			changelogsItem.setEffectTime(_ctx.stringValue("DescribeModifyParameterLogResponse.Changelogs["+ i +"].EffectTime"));

			changelogs.add(changelogsItem);
		}
		describeModifyParameterLogResponse.setChangelogs(changelogs);
	 
	 	return describeModifyParameterLogResponse;
	}
}