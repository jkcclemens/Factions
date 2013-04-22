package com.massivecraft.factions.chat.tag;

import com.massivecraft.factions.chat.ChatTagAbstract;
import com.massivecraft.factions.entity.FPlayer;
import com.massivecraft.factions.entity.FPlayerColl;

public class ChatTagTag extends ChatTagAbstract
{
	// -------------------------------------------- //
	// INSTANCE & CONSTRUCT
	// -------------------------------------------- //
	
	private ChatTagTag() { super("factions_tag"); }
	private static ChatTagTag i = new ChatTagTag();
	public static ChatTagTag get() { return i; }
	
	// -------------------------------------------- //
	// OVERRIDE
	// -------------------------------------------- //

	@Override
	public String getReplacement(String senderId, String sendeeId, String recipientId)
	{		
		FPlayer fsender = FPlayerColl.get().get(senderId);
		if (!fsender.hasFaction()) return "";
		return fsender.getFaction().getTag();
	}

}
