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

import com.aliyuncs.rds.model.v20140815.DescribeLogicDBInstanceTopologyResponse;
import com.aliyuncs.rds.model.v20140815.DescribeLogicDBInstanceTopologyResponse.LogicDBInstanceParameter;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLogicDBInstanceTopologyResponseUnmarshaller {

	public static DescribeLogicDBInstanceTopologyResponse unmarshall(DescribeLogicDBInstanceTopologyResponse describeLogicDBInstanceTopologyResponse, UnmarshallerContext context) {
		
		describeLogicDBInstanceTopologyResponse.setDBInstanceId(context.integerValue("DescribeLogicDBInstanceTopologyResponse.DBInstanceId"));
		describeLogicDBInstanceTopologyResponse.setDBInstanceName(context.stringValue("DescribeLogicDBInstanceTopologyResponse.DBInstanceName"));
		describeLogicDBInstanceTopologyResponse.setDBInstanceStatus(context.integerValue("DescribeLogicDBInstanceTopologyResponse.DBInstanceStatus"));
		describeLogicDBInstanceTopologyResponse.setDBInstanceStatusDesc(context.stringValue("DescribeLogicDBInstanceTopologyResponse.DBInstanceStatusDesc"));
		describeLogicDBInstanceTopologyResponse.setDBInstanceConnType(context.stringValue("DescribeLogicDBInstanceTopologyResponse.DBInstanceConnType"));
		describeLogicDBInstanceTopologyResponse.setDBInstanceDescription(context.stringValue("DescribeLogicDBInstanceTopologyResponse.DBInstanceDescription"));
		describeLogicDBInstanceTopologyResponse.setEngine(context.stringValue("DescribeLogicDBInstanceTopologyResponse.Engine"));
		describeLogicDBInstanceTopologyResponse.setEngineVersion(context.stringValue("DescribeLogicDBInstanceTopologyResponse.EngineVersion"));

		List<LogicDBInstanceParameter> items = new ArrayList<LogicDBInstanceParameter>();
		for (int i = 0; i < context.lengthValue("DescribeLogicDBInstanceTopologyResponse.Items.Length"); i++) {
			LogicDBInstanceParameter logicDBInstanceParameter = new LogicDBInstanceParameter();
			logicDBInstanceParameter.setDBInstanceID(context.integerValue("DescribeLogicDBInstanceTopologyResponse.Items["+ i +"].DBInstanceID"));
			logicDBInstanceParameter.setDBInstanceName(context.stringValue("DescribeLogicDBInstanceTopologyResponse.Items["+ i +"].DBInstanceName"));
			logicDBInstanceParameter.setDBInstanceStatus(context.integerValue("DescribeLogicDBInstanceTopologyResponse.Items["+ i +"].DBInstanceStatus"));
			logicDBInstanceParameter.setDBInstanceStatusDesc(context.stringValue("DescribeLogicDBInstanceTopologyResponse.Items["+ i +"].DBInstanceStatusDesc"));
			logicDBInstanceParameter.setDBInstanceConnType(context.stringValue("DescribeLogicDBInstanceTopologyResponse.Items["+ i +"].DBInstanceConnType"));
			logicDBInstanceParameter.setDBInstanceDescription(context.stringValue("DescribeLogicDBInstanceTopologyResponse.Items["+ i +"].DBInstanceDescription"));
			logicDBInstanceParameter.setEngine(context.stringValue("DescribeLogicDBInstanceTopologyResponse.Items["+ i +"].Engine"));
			logicDBInstanceParameter.setEngineVersion(context.stringValue("DescribeLogicDBInstanceTopologyResponse.Items["+ i +"].EngineVersion"));
			logicDBInstanceParameter.setCharacterType(context.stringValue("DescribeLogicDBInstanceTopologyResponse.Items["+ i +"].CharacterType"));

			items.add(logicDBInstanceParameter);
		}
		describeLogicDBInstanceTopologyResponse.setItems(items);
	 
	 	return describeLogicDBInstanceTopologyResponse;
	}
}