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

import com.aliyuncs.ecd.model.v20200930.DescribeFotaPendingDesktopsResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeFotaPendingDesktopsResponse.FotaPendingDesktop;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFotaPendingDesktopsResponseUnmarshaller {

	public static DescribeFotaPendingDesktopsResponse unmarshall(DescribeFotaPendingDesktopsResponse describeFotaPendingDesktopsResponse, UnmarshallerContext _ctx) {
		
		describeFotaPendingDesktopsResponse.setRequestId(_ctx.stringValue("DescribeFotaPendingDesktopsResponse.RequestId"));
		describeFotaPendingDesktopsResponse.setNextToken(_ctx.stringValue("DescribeFotaPendingDesktopsResponse.NextToken"));

		List<FotaPendingDesktop> fotaPendingDesktops = new ArrayList<FotaPendingDesktop>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFotaPendingDesktopsResponse.FotaPendingDesktops.Length"); i++) {
			FotaPendingDesktop fotaPendingDesktop = new FotaPendingDesktop();
			fotaPendingDesktop.setDesktopId(_ctx.stringValue("DescribeFotaPendingDesktopsResponse.FotaPendingDesktops["+ i +"].DesktopId"));
			fotaPendingDesktop.setDesktopName(_ctx.stringValue("DescribeFotaPendingDesktopsResponse.FotaPendingDesktops["+ i +"].DesktopName"));
			fotaPendingDesktop.setOfficeSiteId(_ctx.stringValue("DescribeFotaPendingDesktopsResponse.FotaPendingDesktops["+ i +"].OfficeSiteId"));
			fotaPendingDesktop.setFotaProject(_ctx.stringValue("DescribeFotaPendingDesktopsResponse.FotaPendingDesktops["+ i +"].FotaProject"));
			fotaPendingDesktop.setCurrentAppVersion(_ctx.stringValue("DescribeFotaPendingDesktopsResponse.FotaPendingDesktops["+ i +"].CurrentAppVersion"));

			fotaPendingDesktops.add(fotaPendingDesktop);
		}
		describeFotaPendingDesktopsResponse.setFotaPendingDesktops(fotaPendingDesktops);
	 
	 	return describeFotaPendingDesktopsResponse;
	}
}