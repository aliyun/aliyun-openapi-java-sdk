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

package com.aliyuncs.aiccs.transform.v20191015;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aiccs.model.v20191015.ListAiccsRobotResponse;
import com.aliyuncs.aiccs.model.v20191015.ListAiccsRobotResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAiccsRobotResponseUnmarshaller {

	public static ListAiccsRobotResponse unmarshall(ListAiccsRobotResponse listAiccsRobotResponse, UnmarshallerContext _ctx) {
		
		listAiccsRobotResponse.setRequestId(_ctx.stringValue("ListAiccsRobotResponse.RequestId"));
		listAiccsRobotResponse.setCode(_ctx.stringValue("ListAiccsRobotResponse.Code"));
		listAiccsRobotResponse.setMessage(_ctx.stringValue("ListAiccsRobotResponse.Message"));
		listAiccsRobotResponse.setSuccess(_ctx.booleanValue("ListAiccsRobotResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAiccsRobotResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setRobotType(_ctx.stringValue("ListAiccsRobotResponse.Data["+ i +"].RobotType"));
			dataItem.setAtSence(_ctx.stringValue("ListAiccsRobotResponse.Data["+ i +"].AtSence"));
			dataItem.setAtProfession(_ctx.stringValue("ListAiccsRobotResponse.Data["+ i +"].AtProfession"));
			dataItem.setRobotName(_ctx.stringValue("ListAiccsRobotResponse.Data["+ i +"].RobotName"));
			dataItem.setId(_ctx.longValue("ListAiccsRobotResponse.Data["+ i +"].Id"));

			data.add(dataItem);
		}
		listAiccsRobotResponse.setData(data);
	 
	 	return listAiccsRobotResponse;
	}
}