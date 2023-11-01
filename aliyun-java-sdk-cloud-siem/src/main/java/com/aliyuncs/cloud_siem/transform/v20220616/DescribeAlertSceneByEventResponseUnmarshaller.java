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

package com.aliyuncs.cloud_siem.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloud_siem.model.v20220616.DescribeAlertSceneByEventResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeAlertSceneByEventResponse.DataItem;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeAlertSceneByEventResponse.DataItem.Target;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAlertSceneByEventResponseUnmarshaller {

	public static DescribeAlertSceneByEventResponse unmarshall(DescribeAlertSceneByEventResponse describeAlertSceneByEventResponse, UnmarshallerContext _ctx) {
		
		describeAlertSceneByEventResponse.setRequestId(_ctx.stringValue("DescribeAlertSceneByEventResponse.RequestId"));
		describeAlertSceneByEventResponse.setSuccess(_ctx.booleanValue("DescribeAlertSceneByEventResponse.Success"));
		describeAlertSceneByEventResponse.setCode(_ctx.integerValue("DescribeAlertSceneByEventResponse.Code"));
		describeAlertSceneByEventResponse.setMessage(_ctx.stringValue("DescribeAlertSceneByEventResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAlertSceneByEventResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAlertType(_ctx.stringValue("DescribeAlertSceneByEventResponse.Data["+ i +"].AlertType"));
			dataItem.setAlertTypeId(_ctx.stringValue("DescribeAlertSceneByEventResponse.Data["+ i +"].AlertTypeId"));
			dataItem.setAlertName(_ctx.stringValue("DescribeAlertSceneByEventResponse.Data["+ i +"].AlertName"));
			dataItem.setAlertNameId(_ctx.stringValue("DescribeAlertSceneByEventResponse.Data["+ i +"].AlertNameId"));
			dataItem.setAlertTile(_ctx.stringValue("DescribeAlertSceneByEventResponse.Data["+ i +"].AlertTile"));
			dataItem.setAlertTileId(_ctx.stringValue("DescribeAlertSceneByEventResponse.Data["+ i +"].AlertTileId"));

			List<Target> targets = new ArrayList<Target>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertSceneByEventResponse.Data["+ i +"].Targets.Length"); j++) {
				Target target = new Target();
				target.setType(_ctx.stringValue("DescribeAlertSceneByEventResponse.Data["+ i +"].Targets["+ j +"].Type"));
				target.setName(_ctx.stringValue("DescribeAlertSceneByEventResponse.Data["+ i +"].Targets["+ j +"].Name"));
				target.setValue(_ctx.stringValue("DescribeAlertSceneByEventResponse.Data["+ i +"].Targets["+ j +"].Value"));

				List<String> values = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeAlertSceneByEventResponse.Data["+ i +"].Targets["+ j +"].Values.Length"); k++) {
					values.add(_ctx.stringValue("DescribeAlertSceneByEventResponse.Data["+ i +"].Targets["+ j +"].Values["+ k +"]"));
				}
				target.setValues(values);

				targets.add(target);
			}
			dataItem.setTargets(targets);

			data.add(dataItem);
		}
		describeAlertSceneByEventResponse.setData(data);
	 
	 	return describeAlertSceneByEventResponse;
	}
}