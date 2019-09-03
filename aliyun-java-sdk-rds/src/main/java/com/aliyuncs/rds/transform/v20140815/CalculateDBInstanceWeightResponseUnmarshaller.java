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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.CalculateDBInstanceWeightResponse;
import com.aliyuncs.rds.model.v20140815.CalculateDBInstanceWeightResponse.DBInstanceWeight;
import com.aliyuncs.transform.UnmarshallerContext;


public class CalculateDBInstanceWeightResponseUnmarshaller {

	public static CalculateDBInstanceWeightResponse unmarshall(CalculateDBInstanceWeightResponse calculateDBInstanceWeightResponse, UnmarshallerContext _ctx) {
		
		calculateDBInstanceWeightResponse.setRequestId(_ctx.stringValue("CalculateDBInstanceWeightResponse.RequestId"));

		List<DBInstanceWeight> items = new ArrayList<DBInstanceWeight>();
		for (int i = 0; i < _ctx.lengthValue("CalculateDBInstanceWeightResponse.Items.Length"); i++) {
			DBInstanceWeight dBInstanceWeight = new DBInstanceWeight();
			dBInstanceWeight.setDBInstanceId(_ctx.stringValue("CalculateDBInstanceWeightResponse.Items["+ i +"].DBInstanceId"));
			dBInstanceWeight.setDBInstanceType(_ctx.stringValue("CalculateDBInstanceWeightResponse.Items["+ i +"].DBInstanceType"));
			dBInstanceWeight.setReadonlyInstanceSQLDelayedTime(_ctx.stringValue("CalculateDBInstanceWeightResponse.Items["+ i +"].ReadonlyInstanceSQLDelayedTime"));
			dBInstanceWeight.setAvailability(_ctx.stringValue("CalculateDBInstanceWeightResponse.Items["+ i +"].Availability"));
			dBInstanceWeight.setWeight(_ctx.stringValue("CalculateDBInstanceWeightResponse.Items["+ i +"].Weight"));

			items.add(dBInstanceWeight);
		}
		calculateDBInstanceWeightResponse.setItems(items);
	 
	 	return calculateDBInstanceWeightResponse;
	}
}