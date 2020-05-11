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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.ListInstalledSoftwareResponse;
import com.aliyuncs.ehpc.model.v20180412.ListInstalledSoftwareResponse.SoftwareListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstalledSoftwareResponseUnmarshaller {

	public static ListInstalledSoftwareResponse unmarshall(ListInstalledSoftwareResponse listInstalledSoftwareResponse, UnmarshallerContext _ctx) {
		
		listInstalledSoftwareResponse.setRequestId(_ctx.stringValue("ListInstalledSoftwareResponse.RequestId"));

		List<SoftwareListItem> softwareList = new ArrayList<SoftwareListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListInstalledSoftwareResponse.SoftwareList.Length"); i++) {
			SoftwareListItem softwareListItem = new SoftwareListItem();
			softwareListItem.setSoftwareId(_ctx.stringValue("ListInstalledSoftwareResponse.SoftwareList["+ i +"].SoftwareId"));
			softwareListItem.setSoftwareName(_ctx.stringValue("ListInstalledSoftwareResponse.SoftwareList["+ i +"].SoftwareName"));
			softwareListItem.setSoftwareVersion(_ctx.stringValue("ListInstalledSoftwareResponse.SoftwareList["+ i +"].SoftwareVersion"));
			softwareListItem.setSoftwareStatus(_ctx.stringValue("ListInstalledSoftwareResponse.SoftwareList["+ i +"].SoftwareStatus"));

			softwareList.add(softwareListItem);
		}
		listInstalledSoftwareResponse.setSoftwareList(softwareList);
	 
	 	return listInstalledSoftwareResponse;
	}
}