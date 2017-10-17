/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeSnapshotsResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeSnapshotsResponse.Snapshot;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSnapshotsResponseUnmarshaller {

	public static DescribeSnapshotsResponse unmarshall(DescribeSnapshotsResponse describeSnapshotsResponse, UnmarshallerContext context) {
		
		describeSnapshotsResponse.setRequestId(context.stringValue("DescribeSnapshotsResponse.RequestId"));

		List<Snapshot> snapshots = new ArrayList<Snapshot>();
		for (int i = 0; i < context.lengthValue("DescribeSnapshotsResponse.Snapshots.Length"); i++) {
			Snapshot snapshot = new Snapshot();
			snapshot.setSnapshotId(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotId"));
			snapshot.setSnapshotName(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].SnapshotName"));
			snapshot.setInstanceId(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].InstanceId"));
			snapshot.setCreateTime(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].CreateTime"));
			snapshot.setMemory(context.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Memory"));
			snapshot.setRdbSize(context.longValue("DescribeSnapshotsResponse.Snapshots["+ i +"].RdbSize"));
			snapshot.setStatus(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Status"));
			snapshot.setType(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].Type"));
			snapshot.setOssDownloadInPath(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].OssDownloadInPath"));
			snapshot.setOssDownloadOutPath(context.stringValue("DescribeSnapshotsResponse.Snapshots["+ i +"].OssDownloadOutPath"));

			snapshots.add(snapshot);
		}
		describeSnapshotsResponse.setSnapshots(snapshots);
	 
	 	return describeSnapshotsResponse;
	}
}