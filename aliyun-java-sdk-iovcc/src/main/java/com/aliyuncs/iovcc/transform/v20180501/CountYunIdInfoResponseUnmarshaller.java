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

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.CountYunIdInfoResponse;
import com.aliyuncs.iovcc.model.v20180501.CountYunIdInfoResponse.YunIdInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CountYunIdInfoResponseUnmarshaller {

	public static CountYunIdInfoResponse unmarshall(CountYunIdInfoResponse countYunIdInfoResponse, UnmarshallerContext _ctx) {
		
		countYunIdInfoResponse.setRequestId(_ctx.stringValue("CountYunIdInfoResponse.RequestId"));

		List<YunIdInfoItem> yunIdInfo = new ArrayList<YunIdInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("CountYunIdInfoResponse.YunIdInfo.Length"); i++) {
			YunIdInfoItem yunIdInfoItem = new YunIdInfoItem();
			yunIdInfoItem.setTotalBrandCount(_ctx.longValue("CountYunIdInfoResponse.YunIdInfo["+ i +"].TotalBrandCount"));
			yunIdInfoItem.setTotalDeviceModelCount(_ctx.longValue("CountYunIdInfoResponse.YunIdInfo["+ i +"].TotalDeviceModelCount"));
			yunIdInfoItem.setTotalDeviceCount(_ctx.longValue("CountYunIdInfoResponse.YunIdInfo["+ i +"].TotalDeviceCount"));

			yunIdInfo.add(yunIdInfoItem);
		}
		countYunIdInfoResponse.setYunIdInfo(yunIdInfo);
	 
	 	return countYunIdInfoResponse;
	}
}