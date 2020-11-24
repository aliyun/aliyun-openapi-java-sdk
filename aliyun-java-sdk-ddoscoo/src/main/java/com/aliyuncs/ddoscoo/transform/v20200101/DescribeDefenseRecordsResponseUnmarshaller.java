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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeDefenseRecordsResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeDefenseRecordsResponse.DefenseRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDefenseRecordsResponseUnmarshaller {

	public static DescribeDefenseRecordsResponse unmarshall(DescribeDefenseRecordsResponse describeDefenseRecordsResponse, UnmarshallerContext _ctx) {
		
		describeDefenseRecordsResponse.setRequestId(_ctx.stringValue("DescribeDefenseRecordsResponse.RequestId"));
		describeDefenseRecordsResponse.setTotalCount(_ctx.longValue("DescribeDefenseRecordsResponse.TotalCount"));

		List<DefenseRecord> defenseRecords = new ArrayList<DefenseRecord>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDefenseRecordsResponse.DefenseRecords.Length"); i++) {
			DefenseRecord defenseRecord = new DefenseRecord();
			defenseRecord.setStartTime(_ctx.longValue("DescribeDefenseRecordsResponse.DefenseRecords["+ i +"].StartTime"));
			defenseRecord.setEndTime(_ctx.longValue("DescribeDefenseRecordsResponse.DefenseRecords["+ i +"].EndTime"));
			defenseRecord.setInstanceId(_ctx.stringValue("DescribeDefenseRecordsResponse.DefenseRecords["+ i +"].InstanceId"));
			defenseRecord.setStatus(_ctx.integerValue("DescribeDefenseRecordsResponse.DefenseRecords["+ i +"].Status"));
			defenseRecord.setAttackPeak(_ctx.longValue("DescribeDefenseRecordsResponse.DefenseRecords["+ i +"].AttackPeak"));
			defenseRecord.setEventCount(_ctx.integerValue("DescribeDefenseRecordsResponse.DefenseRecords["+ i +"].EventCount"));

			defenseRecords.add(defenseRecord);
		}
		describeDefenseRecordsResponse.setDefenseRecords(defenseRecords);
	 
	 	return describeDefenseRecordsResponse;
	}
}