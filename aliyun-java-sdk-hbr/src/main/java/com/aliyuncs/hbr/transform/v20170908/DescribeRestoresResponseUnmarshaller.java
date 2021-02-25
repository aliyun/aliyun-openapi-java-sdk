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

import com.aliyuncs.hbr.model.v20170908.DescribeRestoresResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeRestoresResponse.Restore;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRestoresResponseUnmarshaller {

	public static DescribeRestoresResponse unmarshall(DescribeRestoresResponse describeRestoresResponse, UnmarshallerContext _ctx) {
		
		describeRestoresResponse.setRequestId(_ctx.stringValue("DescribeRestoresResponse.RequestId"));
		describeRestoresResponse.setSuccess(_ctx.booleanValue("DescribeRestoresResponse.Success"));
		describeRestoresResponse.setCode(_ctx.stringValue("DescribeRestoresResponse.Code"));
		describeRestoresResponse.setMessage(_ctx.stringValue("DescribeRestoresResponse.Message"));
		describeRestoresResponse.setTotalCount(_ctx.integerValue("DescribeRestoresResponse.TotalCount"));
		describeRestoresResponse.setPageSize(_ctx.integerValue("DescribeRestoresResponse.PageSize"));
		describeRestoresResponse.setPageNumber(_ctx.integerValue("DescribeRestoresResponse.PageNumber"));

		List<Restore> restores = new ArrayList<Restore>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRestoresResponse.Restores.Length"); i++) {
			Restore restore = new Restore();
			restore.setRestoreId(_ctx.stringValue("DescribeRestoresResponse.Restores["+ i +"].RestoreId"));
			restore.setClientId(_ctx.stringValue("DescribeRestoresResponse.Restores["+ i +"].ClientId"));
			restore.setVaultId(_ctx.stringValue("DescribeRestoresResponse.Restores["+ i +"].VaultId"));
			restore.setSnapshotId(_ctx.stringValue("DescribeRestoresResponse.Restores["+ i +"].SnapshotId"));
			restore.setSnapshotHash(_ctx.stringValue("DescribeRestoresResponse.Restores["+ i +"].SnapshotHash"));
			restore.setRestoreName(_ctx.stringValue("DescribeRestoresResponse.Restores["+ i +"].RestoreName"));
			restore.setSource(_ctx.stringValue("DescribeRestoresResponse.Restores["+ i +"].Source"));
			restore.setTarget(_ctx.stringValue("DescribeRestoresResponse.Restores["+ i +"].Target"));
			restore.setStatus(_ctx.stringValue("DescribeRestoresResponse.Restores["+ i +"].Status"));
			restore.setDuration(_ctx.longValue("DescribeRestoresResponse.Restores["+ i +"].Duration"));
			restore.setCompleteTime(_ctx.longValue("DescribeRestoresResponse.Restores["+ i +"].CompleteTime"));
			restore.setErrorCount(_ctx.longValue("DescribeRestoresResponse.Restores["+ i +"].ErrorCount"));
			restore.setBytesDone(_ctx.longValue("DescribeRestoresResponse.Restores["+ i +"].BytesDone"));
			restore.setBytesTotal(_ctx.longValue("DescribeRestoresResponse.Restores["+ i +"].BytesTotal"));
			restore.setItemsDone(_ctx.longValue("DescribeRestoresResponse.Restores["+ i +"].ItemsDone"));
			restore.setItemsTotal(_ctx.longValue("DescribeRestoresResponse.Restores["+ i +"].ItemsTotal"));
			restore.setActualBytes(_ctx.longValue("DescribeRestoresResponse.Restores["+ i +"].ActualBytes"));
			restore.setExitCode(_ctx.stringValue("DescribeRestoresResponse.Restores["+ i +"].ExitCode"));
			restore.setCreatedTime(_ctx.longValue("DescribeRestoresResponse.Restores["+ i +"].CreatedTime"));
			restore.setUpdatedTime(_ctx.longValue("DescribeRestoresResponse.Restores["+ i +"].UpdatedTime"));
			restore.setRestoreType(_ctx.stringValue("DescribeRestoresResponse.Restores["+ i +"].RestoreType"));
			restore.setContainerRestoreId(_ctx.stringValue("DescribeRestoresResponse.Restores["+ i +"].ContainerRestoreId"));
			restore.setServerId(_ctx.stringValue("DescribeRestoresResponse.Restores["+ i +"].ServerId"));
			restore.setExtra(_ctx.stringValue("DescribeRestoresResponse.Restores["+ i +"].Extra"));
			restore.setSourceClientId(_ctx.stringValue("DescribeRestoresResponse.Restores["+ i +"].SourceClientId"));
			restore.setErrorMessage(_ctx.stringValue("DescribeRestoresResponse.Restores["+ i +"].ErrorMessage"));
			restore.setErrorFile(_ctx.stringValue("DescribeRestoresResponse.Restores["+ i +"].ErrorFile"));

			restores.add(restore);
		}
		describeRestoresResponse.setRestores(restores);
	 
	 	return describeRestoresResponse;
	}
}