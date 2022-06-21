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

package com.aliyuncs.swas.transform.v20170810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas.model.v20170810.GetAppInstallionsResponse;
import com.aliyuncs.swas.model.v20170810.GetAppInstallionsResponse.InstallionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppInstallionsResponseUnmarshaller {

	public static GetAppInstallionsResponse unmarshall(GetAppInstallionsResponse getAppInstallionsResponse, UnmarshallerContext _ctx) {
		
		getAppInstallionsResponse.setRequestId(_ctx.stringValue("GetAppInstallionsResponse.RequestId"));
		getAppInstallionsResponse.setIsSuccess(_ctx.booleanValue("GetAppInstallionsResponse.IsSuccess"));
		getAppInstallionsResponse.setCode(_ctx.stringValue("GetAppInstallionsResponse.Code"));

		List<InstallionsItem> installions = new ArrayList<InstallionsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAppInstallionsResponse.Installions.Length"); i++) {
			InstallionsItem installionsItem = new InstallionsItem();
			installionsItem.setVersion(_ctx.stringValue("GetAppInstallionsResponse.Installions["+ i +"].Version"));
			installionsItem.setPath(_ctx.stringValue("GetAppInstallionsResponse.Installions["+ i +"].Path"));
			installionsItem.setIcon(_ctx.stringValue("GetAppInstallionsResponse.Installions["+ i +"].Icon"));
			installionsItem.setName(_ctx.stringValue("GetAppInstallionsResponse.Installions["+ i +"].Name"));

			installions.add(installionsItem);
		}
		getAppInstallionsResponse.setInstallions(installions);
	 
	 	return getAppInstallionsResponse;
	}
}