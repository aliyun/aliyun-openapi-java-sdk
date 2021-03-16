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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeNcTagResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeNcTagResponse.Event;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeNcTagResponseUnmarshaller {

	public static OpsDescribeNcTagResponse unmarshall(OpsDescribeNcTagResponse opsDescribeNcTagResponse, UnmarshallerContext _ctx) {
		
		opsDescribeNcTagResponse.setRequestId(_ctx.stringValue("OpsDescribeNcTagResponse.RequestId"));
		opsDescribeNcTagResponse.setCode(_ctx.stringValue("OpsDescribeNcTagResponse.Code"));
		opsDescribeNcTagResponse.setMessage(_ctx.stringValue("OpsDescribeNcTagResponse.Message"));
		opsDescribeNcTagResponse.setSuccess(_ctx.stringValue("OpsDescribeNcTagResponse.Success"));

		List<Event> tags = new ArrayList<Event>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeNcTagResponse.Tags.Length"); i++) {
			Event event = new Event();
			event.setNcId(_ctx.stringValue("OpsDescribeNcTagResponse.Tags["+ i +"].NcId"));
			event.setTagKey(_ctx.stringValue("OpsDescribeNcTagResponse.Tags["+ i +"].TagKey"));
			event.setTagValue(_ctx.stringValue("OpsDescribeNcTagResponse.Tags["+ i +"].TagValue"));

			tags.add(event);
		}
		opsDescribeNcTagResponse.setTags(tags);
	 
	 	return opsDescribeNcTagResponse;
	}
}