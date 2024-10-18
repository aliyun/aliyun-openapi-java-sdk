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

package com.aliyuncs.domain.transform.v20180129;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20180129.LookupTmchNoticeResponse;
import com.aliyuncs.domain.model.v20180129.LookupTmchNoticeResponse.Claim;
import com.aliyuncs.domain.model.v20180129.LookupTmchNoticeResponse.Claim.ClassDesc;
import com.aliyuncs.domain.model.v20180129.LookupTmchNoticeResponse.Claim.Contact;
import com.aliyuncs.domain.model.v20180129.LookupTmchNoticeResponse.Claim.Contact.Addr;
import com.aliyuncs.domain.model.v20180129.LookupTmchNoticeResponse.Claim.Holder;
import com.aliyuncs.domain.model.v20180129.LookupTmchNoticeResponse.Claim.Holder.Addr1;
import com.aliyuncs.domain.model.v20180129.LookupTmchNoticeResponse.Claim.JurDesc;
import com.aliyuncs.transform.UnmarshallerContext;


public class LookupTmchNoticeResponseUnmarshaller {

	public static LookupTmchNoticeResponse unmarshall(LookupTmchNoticeResponse lookupTmchNoticeResponse, UnmarshallerContext _ctx) {
		
		lookupTmchNoticeResponse.setRequestId(_ctx.stringValue("LookupTmchNoticeResponse.RequestId"));
		lookupTmchNoticeResponse.setLabel(_ctx.stringValue("LookupTmchNoticeResponse.Label"));
		lookupTmchNoticeResponse.setId(_ctx.longValue("LookupTmchNoticeResponse.Id"));
		lookupTmchNoticeResponse.setNotBefore(_ctx.stringValue("LookupTmchNoticeResponse.NotBefore"));
		lookupTmchNoticeResponse.setNotAfter(_ctx.stringValue("LookupTmchNoticeResponse.NotAfter"));

		List<Claim> claims = new ArrayList<Claim>();
		for (int i = 0; i < _ctx.lengthValue("LookupTmchNoticeResponse.Claims.Length"); i++) {
			Claim claim = new Claim();
			claim.setGoodsAndServices(_ctx.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].GoodsAndServices"));
			claim.setMarkName(_ctx.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].MarkName"));

			JurDesc jurDesc = new JurDesc();
			jurDesc.setJurCC(_ctx.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].JurDesc.JurCC"));
			jurDesc.setDesc(_ctx.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].JurDesc.Desc"));
			claim.setJurDesc(jurDesc);

			List<Contact> contacts = new ArrayList<Contact>();
			for (int j = 0; j < _ctx.lengthValue("LookupTmchNoticeResponse.Claims["+ i +"].Contacts.Length"); j++) {
				Contact contact = new Contact();
				contact.setType(_ctx.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Contacts["+ j +"].Type"));
				contact.setVoice(_ctx.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Contacts["+ j +"].Voice"));
				contact.setEmail(_ctx.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Contacts["+ j +"].Email"));
				contact.setFax(_ctx.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Contacts["+ j +"].Fax"));
				contact.setOrg(_ctx.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Contacts["+ j +"].Org"));
				contact.setName(_ctx.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Contacts["+ j +"].Name"));

				Addr addr = new Addr();
				addr.setCc(_ctx.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Contacts["+ j +"].Addr.Cc"));
				addr.setSp(_ctx.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Contacts["+ j +"].Addr.Sp"));
				addr.setPc(_ctx.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Contacts["+ j +"].Addr.Pc"));
				addr.setCity(_ctx.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Contacts["+ j +"].Addr.City"));

				List<String> street = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("LookupTmchNoticeResponse.Claims["+ i +"].Contacts["+ j +"].Addr.Street.Length"); k++) {
					street.add(_ctx.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Contacts["+ j +"].Addr.Street["+ k +"]"));
				}
				addr.setStreet(street);
				contact.setAddr(addr);

				contacts.add(contact);
			}
			claim.setContacts(contacts);

			List<ClassDesc> classDescs = new ArrayList<ClassDesc>();
			for (int j = 0; j < _ctx.lengthValue("LookupTmchNoticeResponse.Claims["+ i +"].ClassDescs.Length"); j++) {
				ClassDesc classDesc = new ClassDesc();
				classDesc.setClassNum(_ctx.integerValue("LookupTmchNoticeResponse.Claims["+ i +"].ClassDescs["+ j +"].ClassNum"));
				classDesc.setDesc(_ctx.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].ClassDescs["+ j +"].Desc"));

				classDescs.add(classDesc);
			}
			claim.setClassDescs(classDescs);

			List<Holder> holders = new ArrayList<Holder>();
			for (int j = 0; j < _ctx.lengthValue("LookupTmchNoticeResponse.Claims["+ i +"].Holders.Length"); j++) {
				Holder holder = new Holder();
				holder.setEntitlement(_ctx.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Holders["+ j +"].Entitlement"));
				holder.setOrg(_ctx.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Holders["+ j +"].Org"));

				Addr1 addr1 = new Addr1();
				addr1.setCc(_ctx.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Holders["+ j +"].Addr.Cc"));
				addr1.setSp(_ctx.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Holders["+ j +"].Addr.Sp"));
				addr1.setPc(_ctx.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Holders["+ j +"].Addr.Pc"));
				addr1.setCity(_ctx.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Holders["+ j +"].Addr.City"));

				List<String> street2 = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("LookupTmchNoticeResponse.Claims["+ i +"].Holders["+ j +"].Addr.Street.Length"); k++) {
					street2.add(_ctx.stringValue("LookupTmchNoticeResponse.Claims["+ i +"].Holders["+ j +"].Addr.Street["+ k +"]"));
				}
				addr1.setStreet2(street2);
				holder.setAddr1(addr1);

				holders.add(holder);
			}
			claim.setHolders(holders);

			claims.add(claim);
		}
		lookupTmchNoticeResponse.setClaims(claims);
	 
	 	return lookupTmchNoticeResponse;
	}
}