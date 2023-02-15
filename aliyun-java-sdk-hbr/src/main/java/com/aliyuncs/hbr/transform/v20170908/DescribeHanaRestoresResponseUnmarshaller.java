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
		describeHanaRestoresResponse.setPageNumber(_ctx.integerValue("DescribeHanaRestoresResponse.PageNumber"));
		describeHanaRestoresResponse.setPageSize(_ctx.integerValue("DescribeHanaRestoresResponse.PageSize"));
		describeHanaRestoresResponse.setTotalCount(_ctx.integerValue("DescribeHanaRestoresResponse.TotalCount"));

		List<HanaRestores> hanaRestore = new ArrayList<HanaRestores>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHanaRestoresResponse.HanaRestore.Length"); i++) {
			HanaRestores hanaRestores = new HanaRestores();
			hanaRestores.setStatus(_ctx.stringValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].Status"));
			hanaRestores.setReachedTime(_ctx.longValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].ReachedTime"));
			hanaRestores.setLogPaths(_ctx.stringValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].LogPaths"));
			hanaRestores.setVaultId(_ctx.stringValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].VaultId"));
			hanaRestores.setCurrentPhase(_ctx.integerValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].CurrentPhase"));
			hanaRestores.setClearLog(_ctx.booleanValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].ClearLog"));
			hanaRestores.setMessage(_ctx.stringValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].Message"));
			hanaRestores.setCheckAccess(_ctx.booleanValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].CheckAccess"));
			hanaRestores.setMode(_ctx.stringValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].Mode"));
			hanaRestores.setSystemCopy(_ctx.booleanValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].SystemCopy"));
			hanaRestores.setCurrentProgress(_ctx.longValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].CurrentProgress"));
			hanaRestores.setUseDelta(_ctx.booleanValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].UseDelta"));
			hanaRestores.setBackupID(_ctx.longValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].BackupID"));
			hanaRestores.setService(_ctx.stringValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].Service"));
			hanaRestores.setSourceClusterId(_ctx.stringValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].SourceClusterId"));
			hanaRestores.setVolumeId(_ctx.integerValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].VolumeId"));
			hanaRestores.setDatabaseName(_ctx.stringValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].DatabaseName"));
			hanaRestores.setPhase(_ctx.stringValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].Phase"));
			hanaRestores.setClusterId(_ctx.stringValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].ClusterId"));
			hanaRestores.setDatabaseRestoreId(_ctx.longValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].DatabaseRestoreId"));
			hanaRestores.setState(_ctx.stringValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].State"));
			hanaRestores.setSource(_ctx.stringValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].Source"));
			hanaRestores.setMaxPhase(_ctx.integerValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].MaxPhase"));
			hanaRestores.setEndTime(_ctx.longValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].EndTime"));
			hanaRestores.setStartTime(_ctx.longValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].StartTime"));
			hanaRestores.setBackupPrefix(_ctx.stringValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].BackupPrefix"));
			hanaRestores.setRestoreId(_ctx.stringValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].RestoreId"));
			hanaRestores.setLogPosition(_ctx.longValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].LogPosition"));
			hanaRestores.setExtraOptions(_ctx.stringValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].ExtraOptions"));
			hanaRestores.setRecoveryPointInTime(_ctx.longValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].RecoveryPointInTime"));
			hanaRestores.setMaxProgress(_ctx.longValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].MaxProgress"));
			hanaRestores.setUseCatalog(_ctx.booleanValue("DescribeHanaRestoresResponse.HanaRestore["+ i +"].UseCatalog"));

			hanaRestore.add(hanaRestores);
		}
		describeHanaRestoresResponse.setHanaRestore(hanaRestore);
	 
	 	return describeHanaRestoresResponse;
	}
}