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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeCastersResponse;
import com.aliyuncs.live.model.v20161101.DescribeCastersResponse.Caster;
import com.aliyuncs.live.model.v20161101.DescribeCastersResponse.Caster.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCastersResponseUnmarshaller {

	public static DescribeCastersResponse unmarshall(DescribeCastersResponse describeCastersResponse, UnmarshallerContext _ctx) {
		
		describeCastersResponse.setRequestId(_ctx.stringValue("DescribeCastersResponse.RequestId"));
		describeCastersResponse.setTotal(_ctx.integerValue("DescribeCastersResponse.Total"));

		List<Caster> casterList = new ArrayList<Caster>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCastersResponse.CasterList.Length"); i++) {
			Caster caster = new Caster();
			caster.setCasterId(_ctx.stringValue("DescribeCastersResponse.CasterList["+ i +"].CasterId"));
			caster.setCasterName(_ctx.stringValue("DescribeCastersResponse.CasterList["+ i +"].CasterName"));
			caster.setCasterTemplate(_ctx.stringValue("DescribeCastersResponse.CasterList["+ i +"].CasterTemplate"));
			caster.setChannelEnable(_ctx.integerValue("DescribeCastersResponse.CasterList["+ i +"].ChannelEnable"));
			caster.setChargeType(_ctx.stringValue("DescribeCastersResponse.CasterList["+ i +"].ChargeType"));
			caster.setCreateTime(_ctx.stringValue("DescribeCastersResponse.CasterList["+ i +"].CreateTime"));
			caster.setDuration(_ctx.stringValue("DescribeCastersResponse.CasterList["+ i +"].Duration"));
			caster.setExpireTime(_ctx.stringValue("DescribeCastersResponse.CasterList["+ i +"].ExpireTime"));
			caster.setLastModified(_ctx.stringValue("DescribeCastersResponse.CasterList["+ i +"].LastModified"));
			caster.setNormType(_ctx.integerValue("DescribeCastersResponse.CasterList["+ i +"].NormType"));
			caster.setPurchaseTime(_ctx.stringValue("DescribeCastersResponse.CasterList["+ i +"].PurchaseTime"));
			caster.setRoomId(_ctx.integerValue("DescribeCastersResponse.CasterList["+ i +"].RoomId"));
			caster.setStartTime(_ctx.stringValue("DescribeCastersResponse.CasterList["+ i +"].StartTime"));
			caster.setStatus(_ctx.integerValue("DescribeCastersResponse.CasterList["+ i +"].Status"));
			caster.setResourceGroupId(_ctx.integerValue("DescribeCastersResponse.CasterList["+ i +"].ResourceGroupId"));
			caster.setClientTokenId(_ctx.stringValue("DescribeCastersResponse.CasterList["+ i +"].ClientTokenId"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCastersResponse.CasterList["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("DescribeCastersResponse.CasterList["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("DescribeCastersResponse.CasterList["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			caster.setTags(tags);

			casterList.add(caster);
		}
		describeCastersResponse.setCasterList(casterList);
	 
	 	return describeCastersResponse;
	}
}