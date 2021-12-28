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

import com.aliyuncs.ecd.model.v20200930.GetDesktopGroupDetailResponse;
import com.aliyuncs.ecd.model.v20200930.GetDesktopGroupDetailResponse.Desktop;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDesktopGroupDetailResponseUnmarshaller {

	public static GetDesktopGroupDetailResponse unmarshall(GetDesktopGroupDetailResponse getDesktopGroupDetailResponse, UnmarshallerContext _ctx) {
		
		getDesktopGroupDetailResponse.setRequestId(_ctx.stringValue("GetDesktopGroupDetailResponse.RequestId"));

		List<Desktop> desktops = new ArrayList<Desktop>();
		for (int i = 0; i < _ctx.lengthValue("GetDesktopGroupDetailResponse.Desktops.Length"); i++) {
			Desktop desktop = new Desktop();
			desktop.setCreationTime(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops["+ i +"].CreationTime"));
			desktop.setPayType(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops["+ i +"].PayType"));
			desktop.setPolicyGroupName(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops["+ i +"].PolicyGroupName"));
			desktop.setCreator(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops["+ i +"].Creator"));
			desktop.setMaxDesktopsCount(_ctx.integerValue("GetDesktopGroupDetailResponse.Desktops["+ i +"].MaxDesktopsCount"));
			desktop.setAllowAutoSetup(_ctx.integerValue("GetDesktopGroupDetailResponse.Desktops["+ i +"].AllowAutoSetup"));
			desktop.setResType(_ctx.integerValue("GetDesktopGroupDetailResponse.Desktops["+ i +"].ResType"));
			desktop.setSystemDiskSize(_ctx.integerValue("GetDesktopGroupDetailResponse.Desktops["+ i +"].SystemDiskSize"));
			desktop.setPolicyGroupId(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops["+ i +"].PolicyGroupId"));
			desktop.setOwnBundleId(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops["+ i +"].OwnBundleId"));
			desktop.setGpuCount(_ctx.floatValue("GetDesktopGroupDetailResponse.Desktops["+ i +"].GpuCount"));
			desktop.setAllowBufferCount(_ctx.integerValue("GetDesktopGroupDetailResponse.Desktops["+ i +"].AllowBufferCount"));
			desktop.setMemory(_ctx.longValue("GetDesktopGroupDetailResponse.Desktops["+ i +"].Memory"));
			desktop.setGpuSpec(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops["+ i +"].GpuSpec"));
			desktop.setDirectoryId(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops["+ i +"].DirectoryId"));
			desktop.setOwnBundleName(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops["+ i +"].OwnBundleName"));
			desktop.setDataDiskCategory(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops["+ i +"].DataDiskCategory"));
			desktop.setDesktopGroupName(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops["+ i +"].DesktopGroupName"));
			desktop.setSystemDiskCategory(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops["+ i +"].SystemDiskCategory"));
			desktop.setOfficeSiteId(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops["+ i +"].OfficeSiteId"));
			desktop.setKeepDuration(_ctx.longValue("GetDesktopGroupDetailResponse.Desktops["+ i +"].KeepDuration"));
			desktop.setMinDesktopsCount(_ctx.integerValue("GetDesktopGroupDetailResponse.Desktops["+ i +"].MinDesktopsCount"));
			desktop.setDataDiskSize(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops["+ i +"].DataDiskSize"));
			desktop.setDesktopGroupId(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops["+ i +"].DesktopGroupId"));
			desktop.setOfficeSiteName(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops["+ i +"].OfficeSiteName"));
			desktop.setDirectoryType(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops["+ i +"].DirectoryType"));
			desktop.setCpu(_ctx.integerValue("GetDesktopGroupDetailResponse.Desktops["+ i +"].Cpu"));
			desktop.setExpiredTime(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops["+ i +"].ExpiredTime"));
			desktop.setComments(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops["+ i +"].Comments"));
			desktop.setOfficeSiteType(_ctx.stringValue("GetDesktopGroupDetailResponse.Desktops["+ i +"].OfficeSiteType"));
			desktop.setStatus(_ctx.integerValue("GetDesktopGroupDetailResponse.Desktops["+ i +"].Status"));
			desktop.setResetType(_ctx.longValue("GetDesktopGroupDetailResponse.Desktops["+ i +"].ResetType"));

			desktops.add(desktop);
		}
		getDesktopGroupDetailResponse.setDesktops(desktops);
	 
	 	return getDesktopGroupDetailResponse;
	}
}