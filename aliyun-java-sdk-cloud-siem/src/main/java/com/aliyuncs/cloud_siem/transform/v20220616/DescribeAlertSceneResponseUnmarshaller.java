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

import com.aliyuncs.cloud_siem.model.v20220616.DescribeAlertSceneResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeAlertSceneResponse.DataItem;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeAlertSceneResponse.DataItem.Target;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAlertSceneResponseUnmarshaller {

	public static DescribeAlertSceneResponse unmarshall(DescribeAlertSceneResponse describeAlertSceneResponse, UnmarshallerContext _ctx) {
		
		describeAlertSceneResponse.setRequestId(_ctx.stringValue("DescribeAlertSceneResponse.RequestId"));
		describeAlertSceneResponse.setSuccess(_ctx.booleanValue("DescribeAlertSceneResponse.Success"));
		describeAlertSceneResponse.setCode(_ctx.integerValue("DescribeAlertSceneResponse.Code"));
		describeAlertSceneResponse.setMessage(_ctx.stringValue("DescribeAlertSceneResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAlertSceneResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAlertType(_ctx.stringValue("DescribeAlertSceneResponse.Data["+ i +"].AlertType"));
			dataItem.setAlertTypeId(_ctx.stringValue("DescribeAlertSceneResponse.Data["+ i +"].AlertTypeId"));
			dataItem.setAlertName(_ctx.stringValue("DescribeAlertSceneResponse.Data["+ i +"].AlertName"));
			dataItem.setAlertNameId(_ctx.stringValue("DescribeAlertSceneResponse.Data["+ i +"].AlertNameId"));
			dataItem.setAlertTile(_ctx.stringValue("DescribeAlertSceneResponse.Data["+ i +"].AlertTile"));
			dataItem.setAlertTileId(_ctx.stringValue("DescribeAlertSceneResponse.Data["+ i +"].AlertTileId"));

			List<Target> targets = new ArrayList<Target>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlertSceneResponse.Data["+ i +"].Targets.Length"); j++) {
				Target target = new Target();
				target.setType(_ctx.stringValue("DescribeAlertSceneResponse.Data["+ i +"].Targets["+ j +"].Type"));
				target.setName(_ctx.stringValue("DescribeAlertSceneResponse.Data["+ i +"].Targets["+ j +"].Name"));
				target.setValue(_ctx.stringValue("DescribeAlertSceneResponse.Data["+ i +"].Targets["+ j +"].Value"));

				List<String> values = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeAlertSceneResponse.Data["+ i +"].Targets["+ j +"].Values.Length"); k++) {
					values.add(_ctx.stringValue("DescribeAlertSceneResponse.Data["+ i +"].Targets["+ j +"].Values["+ k +"]"));
				}
				target.setValues(values);

				targets.add(target);
			}
			dataItem.setTargets(targets);

			data.add(dataItem);
		}
		describeAlertSceneResponse.setData(data);
	 
	 	return describeAlertSceneResponse;
	}
}