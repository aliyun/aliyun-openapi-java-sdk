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

import com.aliyuncs.hbr.model.v20170908.DescribeVmIncrementalMigrationJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVmIncrementalMigrationJobResponseUnmarshaller {

	public static DescribeVmIncrementalMigrationJobResponse unmarshall(DescribeVmIncrementalMigrationJobResponse describeVmIncrementalMigrationJobResponse, UnmarshallerContext _ctx) {
		
		describeVmIncrementalMigrationJobResponse.setRequestId(_ctx.stringValue("DescribeVmIncrementalMigrationJobResponse.RequestId"));
		describeVmIncrementalMigrationJobResponse.setSuccess(_ctx.booleanValue("DescribeVmIncrementalMigrationJobResponse.Success"));
		describeVmIncrementalMigrationJobResponse.setCode(_ctx.stringValue("DescribeVmIncrementalMigrationJobResponse.Code"));
		describeVmIncrementalMigrationJobResponse.setMessage(_ctx.stringValue("DescribeVmIncrementalMigrationJobResponse.Message"));
		describeVmIncrementalMigrationJobResponse.setVmSnapshotId(_ctx.stringValue("DescribeVmIncrementalMigrationJobResponse.VmSnapshotId"));
		describeVmIncrementalMigrationJobResponse.setMetaRestoreHash(_ctx.stringValue("DescribeVmIncrementalMigrationJobResponse.MetaRestoreHash"));
		describeVmIncrementalMigrationJobResponse.setNeedStartRestore(_ctx.booleanValue("DescribeVmIncrementalMigrationJobResponse.NeedStartRestore"));
		describeVmIncrementalMigrationJobResponse.setSyncId(_ctx.stringValue("DescribeVmIncrementalMigrationJobResponse.SyncId"));

		List<String> diskRestoreList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVmIncrementalMigrationJobResponse.DiskRestoreList.Length"); i++) {
			diskRestoreList.add(_ctx.stringValue("DescribeVmIncrementalMigrationJobResponse.DiskRestoreList["+ i +"]"));
		}
		describeVmIncrementalMigrationJobResponse.setDiskRestoreList(diskRestoreList);
	 
	 	return describeVmIncrementalMigrationJobResponse;
	}
}