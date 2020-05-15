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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.DescribeHanaRestoresResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeHanaRestoresResponse.HanaRestores;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHanaRestoresResponseUnmarshaller {

	public static DescribeHanaRestoresResponse unmarshall(DescribeHanaRestoresResponse describeHanaRestoresResponse, UnmarshallerContext _ctx) {
		
		describeHanaRestoresResponse.setRequestId(_ctx.stringValue("DescribeHanaRestoresResponse.RequestId"));
		describeHanaRestoresResponse.setSuccess(_ctx.booleanValue("DescribeHanaRestoresResponse.Success"));
		describeHanaRestoresResponse.setCode(_ctx.stringValue("DescribeHanaRestoresResponse.Code"));
		describeHanaRestoresResponse.setMessage(_ctx.stringValue("DescribeHanaRestoresResponse.Message"));
		describeHanaRestoresResponse.setTotalCount(_ctx.integerValue("DescribeHanaRestoresResponse.TotalCount"));
		describeHanaRestoresResponse.setPageSize(_ctx.integerValue("DescribeHanaRestoresResponse.PageSize"));
		describeHanaRestoresResponse.setPageNumber(_ctx.integerValue("DescribeHanaRestoresResponse.PageNumber"));

		List<HanaRestores> hanaRestore = new ArrayList<HanaRestores>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHanaRestoresResponse.HanaRestore.Length"); i++) {
			HanaRestores hanaRestores = new HanaRestores();
			hanaRestores.setRestoreId(_ctx.stringValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].RestoreId"));
			hanaRestores.setClusterId(_ctx.stringValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].ClusterId"));
			hanaRestores.setVaultId(_ctx.stringValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].VaultId"));
			hanaRestores.setDatabaseName(_ctx.stringValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].DatabaseName"));
			hanaRestores.setBackupID(_ctx.longValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].BackupID"));
			hanaRestores.setRecoveryPointInTime(_ctx.longValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].RecoveryPointInTime"));
			hanaRestores.setDatabaseRestoreId(_ctx.longValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].DatabaseRestoreId"));
			hanaRestores.setService(_ctx.stringValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].Service"));
			hanaRestores.setStartTime(_ctx.longValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].StartTime"));
			hanaRestores.setEndTime(_ctx.longValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].EndTime"));
			hanaRestores.setReachedTime(_ctx.longValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].ReachedTime"));
			hanaRestores.setState(_ctx.stringValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].State"));
			hanaRestores.setPhase(_ctx.stringValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].Phase"));
			hanaRestores.setMessage(_ctx.stringValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].Message"));
			hanaRestores.setStatus(_ctx.stringValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].Status"));
			hanaRestores.setMaxPhase(_ctx.integerValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].MaxPhase"));
			hanaRestores.setCurrentPhase(_ctx.integerValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].CurrentPhase"));
			hanaRestores.setMaxProgress(_ctx.longValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].MaxProgress"));
			hanaRestores.setCurrentProgress(_ctx.longValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].CurrentProgress"));

			hanaRestore.add(hanaRestores);
		}
		describeHanaRestoresResponse.setHanaRestore(hanaRestore);
	 
	 	return describeHanaRestoresResponse;
	}
}