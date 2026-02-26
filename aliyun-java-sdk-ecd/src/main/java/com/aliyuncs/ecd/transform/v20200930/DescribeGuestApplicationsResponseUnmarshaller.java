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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeGuestApplicationsResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeGuestApplicationsResponse.GuestApplicationModel;
import com.aliyuncs.ecd.model.v20200930.DescribeGuestApplicationsResponse.GuestApplicationModel.Process;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGuestApplicationsResponseUnmarshaller {

	public static DescribeGuestApplicationsResponse unmarshall(DescribeGuestApplicationsResponse describeGuestApplicationsResponse, UnmarshallerContext _ctx) {
		
		describeGuestApplicationsResponse.setRequestId(_ctx.stringValue("DescribeGuestApplicationsResponse.RequestId"));

		List<GuestApplicationModel> applications = new ArrayList<GuestApplicationModel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGuestApplicationsResponse.Applications.Length"); i++) {
			GuestApplicationModel guestApplicationModel = new GuestApplicationModel();
			guestApplicationModel.setApplicationName(_ctx.stringValue("DescribeGuestApplicationsResponse.Applications["+ i +"].ApplicationName"));
			guestApplicationModel.setApplicationVersion(_ctx.stringValue("DescribeGuestApplicationsResponse.Applications["+ i +"].ApplicationVersion"));
			guestApplicationModel.setProcessPath(_ctx.stringValue("DescribeGuestApplicationsResponse.Applications["+ i +"].ProcessPath"));
			guestApplicationModel.setPid(_ctx.integerValue("DescribeGuestApplicationsResponse.Applications["+ i +"].Pid"));
			guestApplicationModel.setCpuPercent(_ctx.doubleValue("DescribeGuestApplicationsResponse.Applications["+ i +"].CpuPercent"));
			guestApplicationModel.setMemPercent(_ctx.doubleValue("DescribeGuestApplicationsResponse.Applications["+ i +"].MemPercent"));
			guestApplicationModel.setGpuPercent(_ctx.doubleValue("DescribeGuestApplicationsResponse.Applications["+ i +"].GpuPercent"));
			guestApplicationModel.setIoSpeed(_ctx.doubleValue("DescribeGuestApplicationsResponse.Applications["+ i +"].IoSpeed"));
			guestApplicationModel.setIconUrl(_ctx.stringValue("DescribeGuestApplicationsResponse.Applications["+ i +"].IconUrl"));
			guestApplicationModel.setStatus(_ctx.stringValue("DescribeGuestApplicationsResponse.Applications["+ i +"].Status"));

			List<Process> processData = new ArrayList<Process>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGuestApplicationsResponse.Applications["+ i +"].ProcessData.Length"); j++) {
				Process process = new Process();
				process.setApplicationName(_ctx.stringValue("DescribeGuestApplicationsResponse.Applications["+ i +"].ProcessData["+ j +"].ApplicationName"));
				process.setApplicationVersion(_ctx.stringValue("DescribeGuestApplicationsResponse.Applications["+ i +"].ProcessData["+ j +"].ApplicationVersion"));
				process.setProcessPath(_ctx.stringValue("DescribeGuestApplicationsResponse.Applications["+ i +"].ProcessData["+ j +"].ProcessPath"));
				process.setPid(_ctx.integerValue("DescribeGuestApplicationsResponse.Applications["+ i +"].ProcessData["+ j +"].Pid"));
				process.setCpuPercent(_ctx.doubleValue("DescribeGuestApplicationsResponse.Applications["+ i +"].ProcessData["+ j +"].CpuPercent"));
				process.setMemPercent(_ctx.doubleValue("DescribeGuestApplicationsResponse.Applications["+ i +"].ProcessData["+ j +"].MemPercent"));
				process.setGpuPercent(_ctx.doubleValue("DescribeGuestApplicationsResponse.Applications["+ i +"].ProcessData["+ j +"].GpuPercent"));
				process.setIospeed(_ctx.doubleValue("DescribeGuestApplicationsResponse.Applications["+ i +"].ProcessData["+ j +"].Iospeed"));

				processData.add(process);
			}
			guestApplicationModel.setProcessData(processData);

			applications.add(guestApplicationModel);
		}
		describeGuestApplicationsResponse.setApplications(applications);
	 
	 	return describeGuestApplicationsResponse;
	}
}