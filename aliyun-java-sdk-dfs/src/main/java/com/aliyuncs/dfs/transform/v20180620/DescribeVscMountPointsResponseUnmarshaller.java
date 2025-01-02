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

package com.aliyuncs.dfs.transform.v20180620;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dfs.model.v20180620.DescribeVscMountPointsResponse;
import com.aliyuncs.dfs.model.v20180620.DescribeVscMountPointsResponse.MountPoint;
import com.aliyuncs.dfs.model.v20180620.DescribeVscMountPointsResponse.MountPoint.Instance;
import com.aliyuncs.dfs.model.v20180620.DescribeVscMountPointsResponse.MountPoint.Instance.Vsc;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVscMountPointsResponseUnmarshaller {

	public static DescribeVscMountPointsResponse unmarshall(DescribeVscMountPointsResponse describeVscMountPointsResponse, UnmarshallerContext _ctx) {
		
		describeVscMountPointsResponse.setRequestId(_ctx.stringValue("DescribeVscMountPointsResponse.RequestId"));
		describeVscMountPointsResponse.setTotalCount(_ctx.integerValue("DescribeVscMountPointsResponse.TotalCount"));

		List<MountPoint> mountPoints = new ArrayList<MountPoint>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVscMountPointsResponse.MountPoints.Length"); i++) {
			MountPoint mountPoint = new MountPoint();
			mountPoint.setMountPointId(_ctx.stringValue("DescribeVscMountPointsResponse.MountPoints["+ i +"].MountPointId"));
			mountPoint.setDescription(_ctx.stringValue("DescribeVscMountPointsResponse.MountPoints["+ i +"].Description"));
			mountPoint.setInstanceTotalCount(_ctx.integerValue("DescribeVscMountPointsResponse.MountPoints["+ i +"].InstanceTotalCount"));
			mountPoint.setMountPointAlias(_ctx.stringValue("DescribeVscMountPointsResponse.MountPoints["+ i +"].MountPointAlias"));

			List<Instance> instances = new ArrayList<Instance>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVscMountPointsResponse.MountPoints["+ i +"].Instances.Length"); j++) {
				Instance instance = new Instance();
				instance.setStatus(_ctx.stringValue("DescribeVscMountPointsResponse.MountPoints["+ i +"].Instances["+ j +"].Status"));
				instance.setInstanceId(_ctx.stringValue("DescribeVscMountPointsResponse.MountPoints["+ i +"].Instances["+ j +"].InstanceId"));

				List<Vsc> vscs = new ArrayList<Vsc>();
				for (int k = 0; k < _ctx.lengthValue("DescribeVscMountPointsResponse.MountPoints["+ i +"].Instances["+ j +"].Vscs.Length"); k++) {
					Vsc vsc = new Vsc();
					vsc.setVscId(_ctx.stringValue("DescribeVscMountPointsResponse.MountPoints["+ i +"].Instances["+ j +"].Vscs["+ k +"].VscId"));
					vsc.setVscType(_ctx.stringValue("DescribeVscMountPointsResponse.MountPoints["+ i +"].Instances["+ j +"].Vscs["+ k +"].VscType"));
					vsc.setVscStatus(_ctx.stringValue("DescribeVscMountPointsResponse.MountPoints["+ i +"].Instances["+ j +"].Vscs["+ k +"].VscStatus"));

					vscs.add(vsc);
				}
				instance.setVscs(vscs);

				instances.add(instance);
			}
			mountPoint.setInstances(instances);

			mountPoints.add(mountPoint);
		}
		describeVscMountPointsResponse.setMountPoints(mountPoints);
	 
	 	return describeVscMountPointsResponse;
	}
}