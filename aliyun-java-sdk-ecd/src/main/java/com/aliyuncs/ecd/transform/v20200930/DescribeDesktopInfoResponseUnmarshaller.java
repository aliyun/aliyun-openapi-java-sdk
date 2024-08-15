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

import com.aliyuncs.ecd.model.v20200930.DescribeDesktopInfoResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeDesktopInfoResponse.Desktop;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDesktopInfoResponseUnmarshaller {

	public static DescribeDesktopInfoResponse unmarshall(DescribeDesktopInfoResponse describeDesktopInfoResponse, UnmarshallerContext _ctx) {
		
		describeDesktopInfoResponse.setRequestId(_ctx.stringValue("DescribeDesktopInfoResponse.RequestId"));

		List<Desktop> desktops = new ArrayList<Desktop>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDesktopInfoResponse.Desktops.Length"); i++) {
			Desktop desktop = new Desktop();
			desktop.setCurrentAppVersion(_ctx.stringValue("DescribeDesktopInfoResponse.Desktops["+ i +"].CurrentAppVersion"));
			desktop.setStartTime(_ctx.stringValue("DescribeDesktopInfoResponse.Desktops["+ i +"].StartTime"));
			desktop.setConnectionStatus(_ctx.stringValue("DescribeDesktopInfoResponse.Desktops["+ i +"].ConnectionStatus"));
			desktop.setDesktopId(_ctx.stringValue("DescribeDesktopInfoResponse.Desktops["+ i +"].DesktopId"));
			desktop.setDesktopStatus(_ctx.stringValue("DescribeDesktopInfoResponse.Desktops["+ i +"].DesktopStatus"));
			desktop.setNewAppVersion(_ctx.stringValue("DescribeDesktopInfoResponse.Desktops["+ i +"].NewAppVersion"));
			desktop.setReleaseNote(_ctx.stringValue("DescribeDesktopInfoResponse.Desktops["+ i +"].ReleaseNote"));
			desktop.setNewAppSize(_ctx.longValue("DescribeDesktopInfoResponse.Desktops["+ i +"].NewAppSize"));
			desktop.setDesktopGroupId(_ctx.stringValue("DescribeDesktopInfoResponse.Desktops["+ i +"].DesktopGroupId"));

			List<String> managementFlag = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDesktopInfoResponse.Desktops["+ i +"].ManagementFlag.Length"); j++) {
				managementFlag.add(_ctx.stringValue("DescribeDesktopInfoResponse.Desktops["+ i +"].ManagementFlag["+ j +"]"));
			}
			desktop.setManagementFlag(managementFlag);

			desktops.add(desktop);
		}
		describeDesktopInfoResponse.setDesktops(desktops);
	 
	 	return describeDesktopInfoResponse;
	}
}