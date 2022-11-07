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

package com.aliyuncs.yunzhi.transform.v20190712;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.yunzhi.model.v20190712.ListRegionsWithAzonesResponse;
import com.aliyuncs.yunzhi.model.v20190712.ListRegionsWithAzonesResponse.Region;
import com.aliyuncs.yunzhi.model.v20190712.ListRegionsWithAzonesResponse.Region.Azone;
import com.aliyuncs.yunzhi.model.v20190712.ListRegionsWithAzonesResponse.Region.CloudPlatformDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRegionsWithAzonesResponseUnmarshaller {

	public static ListRegionsWithAzonesResponse unmarshall(ListRegionsWithAzonesResponse listRegionsWithAzonesResponse, UnmarshallerContext _ctx) {
		
		listRegionsWithAzonesResponse.setRequestId(_ctx.stringValue("ListRegionsWithAzonesResponse.RequestId"));
		listRegionsWithAzonesResponse.setMessage(_ctx.stringValue("ListRegionsWithAzonesResponse.Message"));
		listRegionsWithAzonesResponse.setCode(_ctx.stringValue("ListRegionsWithAzonesResponse.Code"));
		listRegionsWithAzonesResponse.setSuccess(_ctx.booleanValue("ListRegionsWithAzonesResponse.Success"));

		List<Region> data = new ArrayList<Region>();
		for (int i = 0; i < _ctx.lengthValue("ListRegionsWithAzonesResponse.Data.Length"); i++) {
			Region region = new Region();
			region.setId(_ctx.longValue("ListRegionsWithAzonesResponse.Data["+ i +"].Id"));
			region.setRegionCode(_ctx.stringValue("ListRegionsWithAzonesResponse.Data["+ i +"].RegionCode"));
			region.setRegionShowNameCn(_ctx.stringValue("ListRegionsWithAzonesResponse.Data["+ i +"].RegionShowNameCn"));
			region.setOversea(_ctx.stringValue("ListRegionsWithAzonesResponse.Data["+ i +"].Oversea"));

			CloudPlatformDTO cloudPlatformDTO = new CloudPlatformDTO();
			cloudPlatformDTO.setId(_ctx.longValue("ListRegionsWithAzonesResponse.Data["+ i +"].CloudPlatformDTO.Id"));
			cloudPlatformDTO.setCode(_ctx.stringValue("ListRegionsWithAzonesResponse.Data["+ i +"].CloudPlatformDTO.Code"));
			cloudPlatformDTO.setName(_ctx.stringValue("ListRegionsWithAzonesResponse.Data["+ i +"].CloudPlatformDTO.Name"));
			region.setCloudPlatformDTO(cloudPlatformDTO);

			List<Azone> azoneList = new ArrayList<Azone>();
			for (int j = 0; j < _ctx.lengthValue("ListRegionsWithAzonesResponse.Data["+ i +"].AzoneList.Length"); j++) {
				Azone azone = new Azone();
				azone.setId(_ctx.longValue("ListRegionsWithAzonesResponse.Data["+ i +"].AzoneList["+ j +"].Id"));
				azone.setAzoneCode(_ctx.stringValue("ListRegionsWithAzonesResponse.Data["+ i +"].AzoneList["+ j +"].AzoneCode"));
				azone.setAzoneShowNameCn(_ctx.stringValue("ListRegionsWithAzonesResponse.Data["+ i +"].AzoneList["+ j +"].AzoneShowNameCn"));
				azone.setAzoneShowNameEn(_ctx.stringValue("ListRegionsWithAzonesResponse.Data["+ i +"].AzoneList["+ j +"].AzoneShowNameEn"));
				azone.setAzoneShowNameJp(_ctx.stringValue("ListRegionsWithAzonesResponse.Data["+ i +"].AzoneList["+ j +"].AzoneShowNameJp"));
				azone.setMachineRoomId(_ctx.stringValue("ListRegionsWithAzonesResponse.Data["+ i +"].AzoneList["+ j +"].MachineRoomId"));
				azone.setStatus(_ctx.stringValue("ListRegionsWithAzonesResponse.Data["+ i +"].AzoneList["+ j +"].Status"));
				azone.setSort(_ctx.integerValue("ListRegionsWithAzonesResponse.Data["+ i +"].AzoneList["+ j +"].Sort"));
				azone.setCloudPlatformName(_ctx.stringValue("ListRegionsWithAzonesResponse.Data["+ i +"].AzoneList["+ j +"].CloudPlatformName"));
				azone.setPlatformId(_ctx.longValue("ListRegionsWithAzonesResponse.Data["+ i +"].AzoneList["+ j +"].PlatformId"));
				azone.setRegionCode(_ctx.stringValue("ListRegionsWithAzonesResponse.Data["+ i +"].AzoneList["+ j +"].RegionCode"));
				azone.setRegionId(_ctx.longValue("ListRegionsWithAzonesResponse.Data["+ i +"].AzoneList["+ j +"].RegionId"));
				azone.setRegionShowName(_ctx.stringValue("ListRegionsWithAzonesResponse.Data["+ i +"].AzoneList["+ j +"].RegionShowName"));
				azone.setLetter(_ctx.stringValue("ListRegionsWithAzonesResponse.Data["+ i +"].AzoneList["+ j +"].Letter"));
				azone.setAzoneShortCode(_ctx.stringValue("ListRegionsWithAzonesResponse.Data["+ i +"].AzoneList["+ j +"].AzoneShortCode"));
				azone.setPlanDate(_ctx.stringValue("ListRegionsWithAzonesResponse.Data["+ i +"].AzoneList["+ j +"].PlanDate"));
				azone.setInternal(_ctx.integerValue("ListRegionsWithAzonesResponse.Data["+ i +"].AzoneList["+ j +"].Internal"));
				azone.setDistrictName(_ctx.stringValue("ListRegionsWithAzonesResponse.Data["+ i +"].AzoneList["+ j +"].DistrictName"));

				azoneList.add(azone);
			}
			region.setAzoneList(azoneList);

			data.add(region);
		}
		listRegionsWithAzonesResponse.setData(data);
	 
	 	return listRegionsWithAzonesResponse;
	}
}