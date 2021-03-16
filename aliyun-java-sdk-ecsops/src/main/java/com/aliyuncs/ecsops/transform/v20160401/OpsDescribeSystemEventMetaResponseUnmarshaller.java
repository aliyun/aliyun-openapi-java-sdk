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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeSystemEventMetaResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeSystemEventMetaResponse.EventMeta;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeSystemEventMetaResponseUnmarshaller {

	public static OpsDescribeSystemEventMetaResponse unmarshall(OpsDescribeSystemEventMetaResponse opsDescribeSystemEventMetaResponse, UnmarshallerContext _ctx) {
		
		opsDescribeSystemEventMetaResponse.setRequestId(_ctx.stringValue("OpsDescribeSystemEventMetaResponse.RequestId"));
		opsDescribeSystemEventMetaResponse.setTotalCount(_ctx.integerValue("OpsDescribeSystemEventMetaResponse.TotalCount"));

		List<EventMeta> eventMetas = new ArrayList<EventMeta>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeSystemEventMetaResponse.EventMetas.Length"); i++) {
			EventMeta eventMeta = new EventMeta();
			eventMeta.setResourceType(_ctx.stringValue("OpsDescribeSystemEventMetaResponse.EventMetas["+ i +"].ResourceType"));
			eventMeta.setCode(_ctx.integerValue("OpsDescribeSystemEventMetaResponse.EventMetas["+ i +"].Code"));
			eventMeta.setName(_ctx.stringValue("OpsDescribeSystemEventMetaResponse.EventMetas["+ i +"].Name"));
			eventMeta.setOnlyNotification(_ctx.booleanValue("OpsDescribeSystemEventMetaResponse.EventMetas["+ i +"].OnlyNotification"));
			eventMeta.setOpenStatus(_ctx.stringValue("OpsDescribeSystemEventMetaResponse.EventMetas["+ i +"].OpenStatus"));
			eventMeta.setLevel(_ctx.stringValue("OpsDescribeSystemEventMetaResponse.EventMetas["+ i +"].Level"));
			eventMeta.setSupportSimulate(_ctx.booleanValue("OpsDescribeSystemEventMetaResponse.EventMetas["+ i +"].SupportSimulate"));
			eventMeta.setReportCms(_ctx.booleanValue("OpsDescribeSystemEventMetaResponse.EventMetas["+ i +"].ReportCms"));

			eventMetas.add(eventMeta);
		}
		opsDescribeSystemEventMetaResponse.setEventMetas(eventMetas);
	 
	 	return opsDescribeSystemEventMetaResponse;
	}
}