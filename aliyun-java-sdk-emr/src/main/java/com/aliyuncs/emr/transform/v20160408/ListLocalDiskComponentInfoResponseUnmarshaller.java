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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListLocalDiskComponentInfoResponse;
import com.aliyuncs.emr.model.v20160408.ListLocalDiskComponentInfoResponse.ComponentInfo;
import com.aliyuncs.emr.model.v20160408.ListLocalDiskComponentInfoResponse.ComponentInfo.MountParam;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLocalDiskComponentInfoResponseUnmarshaller {

	public static ListLocalDiskComponentInfoResponse unmarshall(ListLocalDiskComponentInfoResponse listLocalDiskComponentInfoResponse, UnmarshallerContext _ctx) {
		
		listLocalDiskComponentInfoResponse.setRequestId(_ctx.stringValue("ListLocalDiskComponentInfoResponse.RequestId"));

		List<ComponentInfo> componentInfoList = new ArrayList<ComponentInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListLocalDiskComponentInfoResponse.ComponentInfoList.Length"); i++) {
			ComponentInfo componentInfo = new ComponentInfo();
			componentInfo.setServiceName(_ctx.stringValue("ListLocalDiskComponentInfoResponse.ComponentInfoList["+ i +"].ServiceName"));
			componentInfo.setServiceDisplayName(_ctx.stringValue("ListLocalDiskComponentInfoResponse.ComponentInfoList["+ i +"].ServiceDisplayName"));
			componentInfo.setComponentName(_ctx.stringValue("ListLocalDiskComponentInfoResponse.ComponentInfoList["+ i +"].ComponentName"));
			componentInfo.setComponentDisplayName(_ctx.stringValue("ListLocalDiskComponentInfoResponse.ComponentInfoList["+ i +"].ComponentDisplayName"));
			componentInfo.setIsolateWarningMsg(_ctx.stringValue("ListLocalDiskComponentInfoResponse.ComponentInfoList["+ i +"].IsolateWarningMsg"));
			componentInfo.setMountWarningMsg(_ctx.stringValue("ListLocalDiskComponentInfoResponse.ComponentInfoList["+ i +"].MountWarningMsg"));
			componentInfo.setRebootWarningMsg(_ctx.stringValue("ListLocalDiskComponentInfoResponse.ComponentInfoList["+ i +"].RebootWarningMsg"));
			componentInfo.setSupportDiskHotSwap(_ctx.booleanValue("ListLocalDiskComponentInfoResponse.ComponentInfoList["+ i +"].SupportDiskHotSwap"));

			List<String> apmMetrics = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLocalDiskComponentInfoResponse.ComponentInfoList["+ i +"].ApmMetrics.Length"); j++) {
				apmMetrics.add(_ctx.stringValue("ListLocalDiskComponentInfoResponse.ComponentInfoList["+ i +"].ApmMetrics["+ j +"]"));
			}
			componentInfo.setApmMetrics(apmMetrics);

			List<MountParam> mountParams = new ArrayList<MountParam>();
			for (int j = 0; j < _ctx.lengthValue("ListLocalDiskComponentInfoResponse.ComponentInfoList["+ i +"].MountParams.Length"); j++) {
				MountParam mountParam = new MountParam();
				mountParam.setName(_ctx.stringValue("ListLocalDiskComponentInfoResponse.ComponentInfoList["+ i +"].MountParams["+ j +"].Name"));
				mountParam.setKey(_ctx.stringValue("ListLocalDiskComponentInfoResponse.ComponentInfoList["+ i +"].MountParams["+ j +"].Key"));
				mountParam.setValueType(_ctx.stringValue("ListLocalDiskComponentInfoResponse.ComponentInfoList["+ i +"].MountParams["+ j +"].ValueType"));
				mountParam.setDefaultValue(_ctx.stringValue("ListLocalDiskComponentInfoResponse.ComponentInfoList["+ i +"].MountParams["+ j +"].DefaultValue"));
				mountParam.setTips(_ctx.stringValue("ListLocalDiskComponentInfoResponse.ComponentInfoList["+ i +"].MountParams["+ j +"].Tips"));
				mountParam.setUnit(_ctx.stringValue("ListLocalDiskComponentInfoResponse.ComponentInfoList["+ i +"].MountParams["+ j +"].Unit"));
				mountParam.setMin(_ctx.integerValue("ListLocalDiskComponentInfoResponse.ComponentInfoList["+ i +"].MountParams["+ j +"].Min"));
				mountParam.setMax(_ctx.integerValue("ListLocalDiskComponentInfoResponse.ComponentInfoList["+ i +"].MountParams["+ j +"].Max"));

				List<String> options = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListLocalDiskComponentInfoResponse.ComponentInfoList["+ i +"].MountParams["+ j +"].Options.Length"); k++) {
					options.add(_ctx.stringValue("ListLocalDiskComponentInfoResponse.ComponentInfoList["+ i +"].MountParams["+ j +"].Options["+ k +"]"));
				}
				mountParam.setOptions(options);

				mountParams.add(mountParam);
			}
			componentInfo.setMountParams(mountParams);

			componentInfoList.add(componentInfo);
		}
		listLocalDiskComponentInfoResponse.setComponentInfoList(componentInfoList);
	 
	 	return listLocalDiskComponentInfoResponse;
	}
}