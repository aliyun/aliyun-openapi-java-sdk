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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.DescribeBuildpackOSByCurrentCloudResponse;
import com.aliyuncs.sofa.model.v20190815.DescribeBuildpackOSByCurrentCloudResponse.BuildpackOsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBuildpackOSByCurrentCloudResponseUnmarshaller {

	public static DescribeBuildpackOSByCurrentCloudResponse unmarshall(DescribeBuildpackOSByCurrentCloudResponse describeBuildpackOSByCurrentCloudResponse, UnmarshallerContext _ctx) {
		
		describeBuildpackOSByCurrentCloudResponse.setRequestId(_ctx.stringValue("DescribeBuildpackOSByCurrentCloudResponse.RequestId"));
		describeBuildpackOSByCurrentCloudResponse.setResultCode(_ctx.stringValue("DescribeBuildpackOSByCurrentCloudResponse.ResultCode"));
		describeBuildpackOSByCurrentCloudResponse.setResultMessage(_ctx.stringValue("DescribeBuildpackOSByCurrentCloudResponse.ResultMessage"));

		List<BuildpackOsItem> buildpackOs = new ArrayList<BuildpackOsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBuildpackOSByCurrentCloudResponse.BuildpackOs.Length"); i++) {
			BuildpackOsItem buildpackOsItem = new BuildpackOsItem();
			buildpackOsItem.setCreationTime(_ctx.stringValue("DescribeBuildpackOSByCurrentCloudResponse.BuildpackOs["+ i +"].CreationTime"));
			buildpackOsItem.setDescription(_ctx.stringValue("DescribeBuildpackOSByCurrentCloudResponse.BuildpackOs["+ i +"].Description"));
			buildpackOsItem.setExtraInfo(_ctx.stringValue("DescribeBuildpackOSByCurrentCloudResponse.BuildpackOs["+ i +"].ExtraInfo"));
			buildpackOsItem.setFullName(_ctx.stringValue("DescribeBuildpackOSByCurrentCloudResponse.BuildpackOs["+ i +"].FullName"));
			buildpackOsItem.setId(_ctx.longValue("DescribeBuildpackOSByCurrentCloudResponse.BuildpackOs["+ i +"].Id"));
			buildpackOsItem.setModificationTime(_ctx.stringValue("DescribeBuildpackOSByCurrentCloudResponse.BuildpackOs["+ i +"].ModificationTime"));
			buildpackOsItem.setName(_ctx.stringValue("DescribeBuildpackOSByCurrentCloudResponse.BuildpackOs["+ i +"].Name"));
			buildpackOsItem.setOsBit(_ctx.longValue("DescribeBuildpackOSByCurrentCloudResponse.BuildpackOs["+ i +"].OsBit"));
			buildpackOsItem.setOsBitNum(_ctx.longValue("DescribeBuildpackOSByCurrentCloudResponse.BuildpackOs["+ i +"].OsBitNum"));
			buildpackOsItem.setVersion(_ctx.stringValue("DescribeBuildpackOSByCurrentCloudResponse.BuildpackOs["+ i +"].Version"));

			List<String> supportedCloudDisplayNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBuildpackOSByCurrentCloudResponse.BuildpackOs["+ i +"].SupportedCloudDisplayNames.Length"); j++) {
				supportedCloudDisplayNames.add(_ctx.stringValue("DescribeBuildpackOSByCurrentCloudResponse.BuildpackOs["+ i +"].SupportedCloudDisplayNames["+ j +"]"));
			}
			buildpackOsItem.setSupportedCloudDisplayNames(supportedCloudDisplayNames);

			List<String> supportedCloudNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBuildpackOSByCurrentCloudResponse.BuildpackOs["+ i +"].SupportedCloudNames.Length"); j++) {
				supportedCloudNames.add(_ctx.stringValue("DescribeBuildpackOSByCurrentCloudResponse.BuildpackOs["+ i +"].SupportedCloudNames["+ j +"]"));
			}
			buildpackOsItem.setSupportedCloudNames(supportedCloudNames);

			buildpackOs.add(buildpackOsItem);
		}
		describeBuildpackOSByCurrentCloudResponse.setBuildpackOs(buildpackOs);
	 
	 	return describeBuildpackOSByCurrentCloudResponse;
	}
}