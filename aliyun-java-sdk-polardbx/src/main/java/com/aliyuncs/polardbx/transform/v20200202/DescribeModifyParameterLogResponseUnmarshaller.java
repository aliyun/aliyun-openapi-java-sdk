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

package com.aliyuncs.polardbx.transform.v20200202;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardbx.model.v20200202.DescribeModifyParameterLogResponse;
import com.aliyuncs.polardbx.model.v20200202.DescribeModifyParameterLogResponse.ChangeLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeModifyParameterLogResponseUnmarshaller {

	public static DescribeModifyParameterLogResponse unmarshall(DescribeModifyParameterLogResponse describeModifyParameterLogResponse, UnmarshallerContext _ctx) {
		
		describeModifyParameterLogResponse.setRequestId(_ctx.stringValue("DescribeModifyParameterLogResponse.RequestId"));
		describeModifyParameterLogResponse.setPageNumber(_ctx.integerValue("DescribeModifyParameterLogResponse.PageNumber"));
		describeModifyParameterLogResponse.setPageSize(_ctx.integerValue("DescribeModifyParameterLogResponse.PageSize"));

		List<ChangeLog> changeLogs = new ArrayList<ChangeLog>();
		for (int i = 0; i < _ctx.lengthValue("DescribeModifyParameterLogResponse.ChangeLogs.Length"); i++) {
			ChangeLog changeLog = new ChangeLog();
			changeLog.setParameterName(_ctx.stringValue("DescribeModifyParameterLogResponse.ChangeLogs["+ i +"].ParameterName"));
			changeLog.setOldParameterValue(_ctx.stringValue("DescribeModifyParameterLogResponse.ChangeLogs["+ i +"].OldParameterValue"));
			changeLog.setNewParameterValue(_ctx.stringValue("DescribeModifyParameterLogResponse.ChangeLogs["+ i +"].NewParameterValue"));
			changeLog.setSynced(_ctx.integerValue("DescribeModifyParameterLogResponse.ChangeLogs["+ i +"].Synced"));
			changeLog.setChangeTime(_ctx.stringValue("DescribeModifyParameterLogResponse.ChangeLogs["+ i +"].ChangeTime"));

			changeLogs.add(changeLog);
		}
		describeModifyParameterLogResponse.setChangeLogs(changeLogs);
	 
	 	return describeModifyParameterLogResponse;
	}
}