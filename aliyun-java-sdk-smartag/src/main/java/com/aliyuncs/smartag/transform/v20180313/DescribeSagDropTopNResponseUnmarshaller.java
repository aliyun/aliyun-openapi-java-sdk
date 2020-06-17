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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribeSagDropTopNResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeSagDropTopNResponse.DropTopNItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSagDropTopNResponseUnmarshaller {

	public static DescribeSagDropTopNResponse unmarshall(DescribeSagDropTopNResponse describeSagDropTopNResponse, UnmarshallerContext _ctx) {
		
		describeSagDropTopNResponse.setRequestId(_ctx.stringValue("DescribeSagDropTopNResponse.RequestId"));

		List<DropTopNItem> dropTopN = new ArrayList<DropTopNItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSagDropTopNResponse.DropTopN.Length"); i++) {
			DropTopNItem dropTopNItem = new DropTopNItem();
			dropTopNItem.setInstanceId(_ctx.stringValue("DescribeSagDropTopNResponse.DropTopN["+ i +"].InstanceId"));
			dropTopNItem.setDropRate(_ctx.stringValue("DescribeSagDropTopNResponse.DropTopN["+ i +"].DropRate"));
			dropTopNItem.setName(_ctx.stringValue("DescribeSagDropTopNResponse.DropTopN["+ i +"].Name"));
			dropTopNItem.setRegionId(_ctx.stringValue("DescribeSagDropTopNResponse.DropTopN["+ i +"].RegionId"));

			dropTopN.add(dropTopNItem);
		}
		describeSagDropTopNResponse.setDropTopN(dropTopN);
	 
	 	return describeSagDropTopNResponse;
	}
}